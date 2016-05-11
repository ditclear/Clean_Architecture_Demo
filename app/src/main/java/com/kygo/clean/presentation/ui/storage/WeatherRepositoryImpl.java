package com.kygo.clean.presentation.ui.storage;

import android.content.Context;

import com.kygo.clean.domain.model.JsonBean;
import com.kygo.clean.domain.repository.WeatherRepository;
import com.kygo.clean.presentation.ui.network.RetrofitFactory;

import rx.Observable;

/**
 * Created by kygo on 2016/5/11 0011.
 */
public class WeatherRepositoryImpl implements WeatherRepository {

    private Context mContext;
    String mCity;
    String mProvince;
    public WeatherRepositoryImpl(Context context,String city, String province){

        mContext=context;
        mCity=city;
        mProvince=province;
    }
    @Override
    public Observable<JsonBean> getWeatherMessage() {
        return RetrofitFactory.create().getWeather("129c694723666",mCity,mProvince);
    }
}
