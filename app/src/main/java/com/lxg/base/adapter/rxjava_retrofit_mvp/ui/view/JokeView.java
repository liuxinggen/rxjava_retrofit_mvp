package com.lxg.base.adapter.rxjava_retrofit_mvp.ui.view;


import com.lxg.base.adapter.rxjava_retrofit_mvp.base.BaseView;
import com.lxg.base.adapter.rxjava_retrofit_mvp.bean.Joke;

/**
 * 类名：com.agri.expert.ui.view
 * 时间：2017/12/27 11:52
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 *
 * @author Liu_xg
 */

public interface JokeView extends BaseView {
    /**
     * 成功
     * @param joke
     */
    void susses(Joke joke);

    /**
     * 错误
     * @param errorMsg
     */
    void fail(String errorMsg);
}
