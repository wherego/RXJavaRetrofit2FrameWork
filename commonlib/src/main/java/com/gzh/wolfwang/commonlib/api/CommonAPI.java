package com.gzh.wolfwang.commonlib.api;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/**
 * author：WolfWang
 * date：2017/4/12 16:59
 * e-mail：1678173987@qq.com
 * description：网络请求的公共接口类
 */

public interface CommonAPI {


    public static final String Base_URL = "http://192.168.0.0/";

    /**
     * 普通写法
     * 对相应的servlet进行请求
     */
    @GET("service/getIpInfo.php/")
    Observable<ResponseBody> getData(@Query("ip") String ip);

    /**
     * 请求连接地址加上map的请求通过注解get进行标记请求方式
     *
     * @param url
     * @param maps
     * @return
     */
    @GET("{url}")
    Observable<ResponseBody> executeGet(
            @Path("url") String url,
            @QueryMap Map<String, String> maps);


    /**
     * 同上，这个是post请求
     *
     * @param url
     * @param maps
     * @return
     */
    @POST("{url}")
    Observable<ResponseBody> executePost(
            @Path("url") String url,
            @QueryMap Map<String, String> maps);

    /**
     * 通过提交表单的形式进行的post请求，上传图片的时候会用到
     *
     * @param url
     * @param avatar
     * @return
     */
    @Multipart
    @POST("{url}")
    Observable<ResponseBody> upLoadFile(
            @Path("url") String url,
            @Part("image\";filename =\"image.jpg") RequestBody avatar);


    /**
     * 上传文件
     *
     * @param url
     * @param headers
     * @param description
     * @param maps
     * @return
     */
    @POST("{url}")
    Observable<ResponseBody> uploadFiles(
            @Path("url") String url,
            @Path("headers") Map<String, String> headers,
            @Part("filename") String description,
            @PartMap() Map<String, RequestBody> maps);

    /**
     * 进行下载文件
     *
     * @param fileUrl
     * @return
     */
    @Streaming
    @GET
    Observable<ResponseBody> downloadFile(@Url String fileUrl);


}
