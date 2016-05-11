package com.kygo.clean;

import android.app.Application;

import com.kygo.clean.domain.executer.Executor;
import com.kygo.clean.domain.executer.MainThread;
import com.kygo.clean.domain.executer.impl.ThreadExecutor;
import com.kygo.clean.threading.MainThreadImpl;

/**
 * Created by kygo on 2016/5/11 0011.
 */
public class CleanApplication extends Application {

    public  Executor mExecutor;
    public MainThread mMainThread;
    @Override
    public void onCreate() {
        super.onCreate();
        mExecutor= ThreadExecutor.getInstance();
        mMainThread= MainThreadImpl.getInstance();
    }
}
