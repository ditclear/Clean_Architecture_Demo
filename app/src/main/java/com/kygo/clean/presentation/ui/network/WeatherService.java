package com.kygo.clean.presentation.ui.network;

import com.kygo.clean.domain.model.JsonBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by kygo on 2016/5/10 0010.
 */
public interface WeatherService {

    @GET("query")
    Observable<JsonBean> getWeather(@Query("key") String appkey,
                                    @Query("city") String city,
                                    @Query("province") String province);
}
