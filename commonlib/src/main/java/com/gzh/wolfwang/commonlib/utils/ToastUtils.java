package com.gzh.wolfwang.commonlib.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * author：WolfWang
 * date：2017/4/12 15:25
 * e-mail：1678173987@qq.com
 * description：土司工具类
 */

public class ToastUtils {
    private  static boolean isToast = true;


    public static void showToastShort(Context context, String text) {
        if (isToast)
            Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
        return;
    }

    public static void showToastLong(Context context, String text) {
        if (isToast)
            Toast.makeText(context, text, Toast.LENGTH_LONG).show();
        return;
    }
}
