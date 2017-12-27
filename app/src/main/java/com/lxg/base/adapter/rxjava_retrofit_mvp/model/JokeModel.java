package com.lxg.base.adapter.rxjava_retrofit_mvp.model;


import com.lxg.base.adapter.rxjava_retrofit_mvp.base.BaseApi;
import com.lxg.base.adapter.rxjava_retrofit_mvp.base.BaseModel;
import com.lxg.base.adapter.rxjava_retrofit_mvp.base.BaseObserver;
import com.lxg.base.adapter.rxjava_retrofit_mvp.bean.Joke;
import com.lxg.base.adapter.rxjava_retrofit_mvp.net.callback.Callback;

import java.util.List;

import io.reactivex.Observer;

/**
 * 类名：com.agri.expert.model
 * 时间：2017/12/27 11:54
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 *
 * @author Liu_xg
 */

public class JokeModel implements BaseModel {


    public Observer<BaseApi<List<Joke>>> getSecondData(final Callback<Joke> callback) {
        return new BaseObserver<List<Joke>>() {
            @Override
            public void handleData(List<Joke> jokes) {

                for (Joke joke : jokes) {
                    //接口回掉给P层
                    callback.success(joke);
                }
            }

            @Override
            public void errorMsg(String msg) {
                callback.fail(msg);
            }
        };
    }



}
