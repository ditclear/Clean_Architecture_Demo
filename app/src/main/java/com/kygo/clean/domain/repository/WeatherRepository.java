package com.kygo.clean.domain.repository;

import com.kygo.clean.domain.model.JsonBean;

import rx.Observable;

/**
 * Created by kygo on 2016/5/10 0010.
 */
public interface WeatherRepository {

    Observable<JsonBean> getWeatherMessage();
}
