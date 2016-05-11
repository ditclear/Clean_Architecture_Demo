package com.kygo.clean.domain.executer;

/**
 * Created by kygo on 2016/5/10 0010.
 */
public interface MainThread {
    /**
     * Make runnable operation run in the main thread.
     *
     * @param runnable The runnable to run.
     */
    void post(Runnable runnable);
}
