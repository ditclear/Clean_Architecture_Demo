package com.kygo.clean.domain.interactor.impl;

import android.util.Log;

import com.kygo.clean.domain.executer.Executor;
import com.kygo.clean.domain.executer.MainThread;
import com.kygo.clean.domain.interactor.WeatherInteractor;
import com.kygo.clean.domain.interactor.base.BaseInteractor;
import com.kygo.clean.domain.model.JsonBean;
import com.kygo.clean.domain.model.ResultEntity;
import com.kygo.clean.domain.repository.WeatherRepository;

import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

/**
 * Created by kygo on 2016/5/10 0010.
 */
public class WeatherInteractorImpl extends BaseInteractor implements WeatherInteractor {

    private WeatherInteractor.CallBack mCallBack;
    private WeatherRepository mRepository;

    public WeatherInteractorImpl(Executor threadExecutor, MainThread mainThread,CallBack callBack, WeatherRepository repository) {
        super(threadExecutor,mainThread);
        mCallBack = callBack;
        mRepository = repository;
    }

    @Override
    public void run() {
        // 获取消息
        final Observable<JsonBean> weather = mRepository.getWeatherMessage();

        // 已成功获取消息，通知UI
        weather.subscribeOn(Schedulers.newThread())
                .subscribe(new Subscriber<JsonBean>() {
            @Override
            public void onCompleted() {
                Log.d("rx","completed");
            }

            @Override
            public void onError(Throwable e) {
                notifyError();
                return;
            }

            @Override
            public void onNext(JsonBean jsonBean) {
//                if (weather==null){ onError(new RuntimeException()); return;}
                String code=jsonBean.getMsg();
                postMessage(jsonBean.getResult().get(0));
            }
        });
    }
    private void notifyError() {
        mMainThread.post(new Runnable() {
            @Override
            public void run() {
                mCallBack.onRetrievalFailed("Nothing to welcome you with :(");
            }
        });
    }

    private void postMessage(final ResultEntity msg) {
        mMainThread.post(new Runnable() {
            @Override
            public void run() {
                mCallBack.onWeatherRetrieved(msg);
            }
        });
    }
    @Override
    public void execute() {
        run();
    }
}
