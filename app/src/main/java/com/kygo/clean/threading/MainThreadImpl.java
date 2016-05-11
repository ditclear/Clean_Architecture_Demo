package com.kygo.clean.threading;

import android.os.Handler;
import android.os.Looper;

import com.kygo.clean.domain.executer.MainThread;


/**
 * Created by kygo on 2016/5/11 0011.
 */
public class MainThreadImpl implements MainThread {

    private static MainThread mainThread;
    private Handler mHandler;

    private MainThreadImpl(){
        mHandler=new Handler(Looper.getMainLooper());
    }
    @Override
    public void post(Runnable runnable) {
        mHandler.post(runnable);
    }
    
    public static MainThread getInstance(){
        if ( mainThread== null) {
            mainThread=new MainThreadImpl();
        }
        return mainThread;
    }
}
