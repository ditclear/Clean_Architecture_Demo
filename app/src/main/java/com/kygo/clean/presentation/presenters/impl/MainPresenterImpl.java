package com.kygo.clean.presentation.presenters.impl;

import android.util.Log;

import com.kygo.clean.domain.executer.Executor;
import com.kygo.clean.domain.executer.MainThread;
import com.kygo.clean.domain.interactor.WeatherInteractor;
import com.kygo.clean.domain.interactor.impl.WeatherInteractorImpl;
import com.kygo.clean.domain.model.ResultEntity;
import com.kygo.clean.domain.repository.WeatherRepository;
import com.kygo.clean.presentation.presenters.MainPresenter;
import com.kygo.clean.presentation.presenters.base.AbstractPresenter;

/**
 * Created by kygo on 2016/5/10 0010.
 */
public class MainPresenterImpl extends AbstractPresenter implements MainPresenter,WeatherInteractor.CallBack {

    private MainPresenter.View mView;
    Executor mExecutor;
    MainThread mMainThread;
    WeatherRepository mRepository;
    public MainPresenterImpl(Executor executor, MainThread mainThread, View view,WeatherRepository repository) {
        super(executor, mainThread);
        mExecutor=executor;
        mMainThread=mainThread;
        mView=view;
        mRepository=repository;
    }

    @Override
    public void resume() {
        mView.hideProgress();
        WeatherInteractor weatherInteractor=new WeatherInteractorImpl(mExecutor,mMainThread,this,mRepository);

        weatherInteractor.execute();
    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void onError(String message) {

    }

    @Override
    public void onWeatherRetrieved(ResultEntity message) {
        Log.d("message","success");
        mView.onWeatherLoaded(message);
    }

    @Override
    public void onRetrievalFailed(String error) {
        Log.e("error1",error);
    }
}
