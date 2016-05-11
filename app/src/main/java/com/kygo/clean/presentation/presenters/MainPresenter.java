package com.kygo.clean.presentation.presenters;

import com.kygo.clean.domain.model.ResultEntity;
import com.kygo.clean.presentation.presenters.base.BasePresenter;
import com.kygo.clean.presentation.ui.BaseView;

/**
 * Created by kygo on 2016/5/10 0010.
 */
public interface MainPresenter extends BasePresenter {

    interface View extends BaseView {
        // TODO: Add your view methods
        void onWeatherLoaded(ResultEntity weather);
    }
}
