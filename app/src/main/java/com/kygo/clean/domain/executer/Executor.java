package com.kygo.clean.domain.executer;

import com.kygo.clean.domain.interactor.base.BaseInteractor;

/**
 * Created by kygo on 2016/5/10 0010.
 */
public interface Executor {
    /**
     * This method should call the interactor's run method and thus start the interactor. This should be called
     * on a background thread as interactors might do lengthy operations.
     *
     * @param interactor The interactor to run.
     */
    void execute(final BaseInteractor interactor);
}
