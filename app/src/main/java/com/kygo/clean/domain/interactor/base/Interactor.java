package com.kygo.clean.domain.interactor.base;

/**
 * Created by kygo on 2016/5/10 0010.
 */
public interface Interactor {

    /**
     * This is the main method that starts an interactor. It will make sure that the interactor operation is done on a
     * background thread.
     */
    void execute();
}
