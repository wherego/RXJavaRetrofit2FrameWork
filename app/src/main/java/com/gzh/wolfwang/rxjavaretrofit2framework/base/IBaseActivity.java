package com.gzh.wolfwang.rxjavaretrofit2framework.base;

/**
 * author：WolfWang
 * date：2017/4/12 14:33
 * e-mail：1678173987@qq.com
 * description：baseactivity 的接口
 */

public interface IBaseActivity {

    /**
     * 吐司
     *
     * @param text
     */
    void showToast(String text);

    /**
     * 显示dialog
     */
    void showLoading();

    /**
     * 隐藏 dialog
     */
    void hideLoading();

    /**
     * 判断是否有网络连接,没有返回false
     */
    boolean isInternetConnected();

}
