package com.lxg.base.adapter.rxjava_retrofit_mvp.net;

import com.lxg.base.adapter.rxjava_retrofit_mvp.base.BaseApi;
import com.lxg.base.adapter.rxjava_retrofit_mvp.bean.Joke;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 类名： Api
 * 时间：2017/12/27 11:36
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 *
 * @author Liu_xg
 */

public interface Api {

    //sort=desc&page=1&pagesize=10&time=1418816972&key=1186ca08b861129b0dbf58bdd2a00cd8
    @GET("joke/content/list.from")
    Observable<BaseApi<List<Joke>>> searchJoke(@Query("sort") String sort,
                                               @Query("page") int page,
                                               @Query("pagesize") int pagesize,
                                               @Query("time") String time);

}
