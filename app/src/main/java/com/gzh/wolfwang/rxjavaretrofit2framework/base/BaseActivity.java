package com.gzh.wolfwang.rxjavaretrofit2framework.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.gzh.wolfwang.commonlib.utils.ToastUtils;

/**
 * author：WolfWang
 * date：2017/4/12 09:09
 * e-mail：1678173987@qq.com
 * description：activity 的基类
 */

public class BaseActivity  extends AppCompatActivity implements IBaseActivity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    protected void onStop() {
        super.onStop();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    @Override
    public void showToast(String text) {
        ToastUtils.showToastShort(this,text);

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public boolean isInternetConnected() {
        return false;
    }
}
