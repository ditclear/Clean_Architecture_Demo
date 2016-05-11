package com.kygo.clean.domain.interactor;

import com.kygo.clean.domain.interactor.base.Interactor;
import com.kygo.clean.domain.model.ResultEntity;

/**
 * Created by kygo on 2016/5/10 0010.
 */
public interface WeatherInteractor extends Interactor{
    interface CallBack{
        void onWeatherRetrieved(ResultEntity message);
        void onRetrievalFailed(String error);
    }
}
