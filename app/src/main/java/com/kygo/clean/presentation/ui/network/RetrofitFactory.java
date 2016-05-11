package com.kygo.clean.presentation.ui.network;


import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by kygo on 2016/5/10 0010.
 */
public class RetrofitFactory {
    private static final String BASE_URL="http://apicloud.mob.com/v1/weather/";
    public static WeatherService create(){
        Retrofit retrofit=new Retrofit.Builder()
                                .baseUrl(BASE_URL)
                                .addConverterFactory(GsonConverterFactory.create())
                                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                                .build();
        return retrofit.create(WeatherService.class);
    }
}
