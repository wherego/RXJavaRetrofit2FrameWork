package com.gzh.wolfwang.rxjavaretrofit2framework.base;

import android.app.Application;

/**
 * author：WolfWang
 * date：2017/4/11 17:00
 * e-mail：1678173987@qq.com
 * description：全局application
 *
 */

public class MyApplication extends Application{


    private static MyApplication application;


    public static MyApplication getInstance(){
        return application;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        if(application==null){
            synchronized (MyApplication.class){
                application=this;
            }
        }
    }
}
