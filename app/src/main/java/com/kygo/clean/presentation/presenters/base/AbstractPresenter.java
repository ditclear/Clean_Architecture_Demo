package com.kygo.clean.presentation.presenters.base;

import com.kygo.clean.domain.executer.Executor;
import com.kygo.clean.domain.executer.MainThread;

/**
 * Created by kygo on 2016/5/10 0010.
 */
public abstract class AbstractPresenter {
    protected Executor   mExecutor;
    protected MainThread mMainThread;

    public AbstractPresenter(Executor executor, MainThread mainThread) {
        mExecutor = executor;
        mMainThread = mainThread;
    }
}
