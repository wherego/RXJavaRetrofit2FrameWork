package com.gzh.wolfwang.commonlib.interceptor;


import java.io.IOException;
import java.util.Map;
import java.util.Set;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * author：WolfWang
 * date：2017/4/13 16:26
 * e-mail：1678173987@qq.com
 * description：基础拦截器，用来打印一些请求头信息和响应体结果
 */

public class BaseInterceptor implements Interceptor {

    private Map<String, String> headers;

    public BaseInterceptor(Map<String, String> headers) {
        this.headers = headers;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder builder = chain.request().newBuilder();
        if (headers != null && headers.size() > 0) {
            Set<String> keys = headers.keySet();
            for (String headerkey : keys) {
                builder.addHeader(headerkey, headers.get(headerkey)).build();
            }
        }
        return chain.proceed(builder.build());
    }
}
