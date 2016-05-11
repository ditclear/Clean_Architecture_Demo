package com.kygo.clean.domain.interactor.base;

import com.kygo.clean.domain.executer.Executor;
import com.kygo.clean.domain.executer.MainThread;

/**
 * Created by kygo on 2016/5/10 0010.
 */
public abstract class BaseInteractor implements Interactor{


    protected Executor   mThreadExecutor;
    protected MainThread mMainThread;

    protected volatile boolean mIsCanceled;
    protected volatile boolean mIsRunning;

    public BaseInteractor(Executor threadExecutor, MainThread mainThread) {
        mThreadExecutor = threadExecutor;
        mMainThread = mainThread;
    }

    /**
     * This method contains the actual business logic of the interactor. It SHOULD NOT BE USED DIRECTLY but, instead, a
     * developer should call the execute() method of an interactor to make sure the operation is done on a background thread.
     * <p/>
     * This method should only be called directly while doing unit/integration tests. That is the only reason it is declared
     * public as to help with easier testing.
     */
    public abstract void run();

    public void cancel() {
        mIsCanceled = true;
        mIsRunning = false;
    }

    public boolean isRunning() {
        return mIsRunning;
    }

    public void onFinished() {
        mIsRunning = false;
        mIsCanceled = false;
    }

    public void execute() {

        // mark this interactor as running
        this.mIsRunning = true;

        // start running this interactor in a background thread
        mThreadExecutor.execute(this);
    }
}
