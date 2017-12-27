package com.lxg.base.adapter.rxjava_retrofit_mvp.presenter;


import com.lxg.base.adapter.rxjava_retrofit_mvp.base.BaseApi;
import com.lxg.base.adapter.rxjava_retrofit_mvp.base.BasePresenter;
import com.lxg.base.adapter.rxjava_retrofit_mvp.base.BaseRx;
import com.lxg.base.adapter.rxjava_retrofit_mvp.base.RetrofitHelper;
import com.lxg.base.adapter.rxjava_retrofit_mvp.bean.Joke;
import com.lxg.base.adapter.rxjava_retrofit_mvp.model.JokeModel;
import com.lxg.base.adapter.rxjava_retrofit_mvp.net.callback.Callback;
import com.lxg.base.adapter.rxjava_retrofit_mvp.ui.view.JokeView;

import java.util.List;

/**
 * 类名：com.agri.expert.presenter
 * 时间：2017/12/27 11:55
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 *
 * @author Liu_xg
 */

public class JokePresenter extends BasePresenter<JokeView, JokeModel> {

    public void search(String sort, int page, int pagesize, String time) {
        RetrofitHelper.getApi()
                .searchJoke(sort, page, pagesize, time)
                .compose(BaseRx.<BaseApi<List<Joke>>>io4main())
                .compose(mView.bindLifecycle())
                .subscribe(mModel.getSecondData(new Callback<Joke>() {
                    @Override
                    public void success(Joke joke) {
                        //返回给V层
                        mView.susses(joke);
                    }

                    @Override
                    public void fail(String msg) {
                        mView.fail(msg);
                    }
                }));
    }
}
