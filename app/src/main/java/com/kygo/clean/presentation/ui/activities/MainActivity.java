package com.kygo.clean.presentation.ui.activities;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.kygo.clean.CleanApplication;
import com.kygo.clean.R;
import com.kygo.clean.domain.model.ResultEntity;
import com.kygo.clean.presentation.presenters.MainPresenter;
import com.kygo.clean.presentation.presenters.base.BasePresenter;
import com.kygo.clean.presentation.presenters.impl.MainPresenterImpl;
import com.kygo.clean.presentation.ui.storage.WeatherRepositoryImpl;

public class MainActivity extends AppCompatActivity implements MainPresenter.View {

    CleanApplication app;
    BasePresenter mPresenter;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.text = (TextView) findViewById(R.id.text);
        app= (CleanApplication) getApplication();
        mPresenter=new MainPresenterImpl(app.mExecutor,app.mMainThread,
                this,new WeatherRepositoryImpl(this,"成都","四川"));
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.resume();
    }


    @Override
    public void onWeatherLoaded(ResultEntity weather) {
        text.setText(weather.toString());
    }

    @Override
    public void showProgress() {
        ProgressDialog dialog=ProgressDialog.show(this,"正在加载...","请耐心等待");
    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showError(String message) {

    }
}
