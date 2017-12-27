package com.lxg.base.adapter.rxjava_retrofit_mvp.base;

/**
 * 类名： BasePresenter
 * 时间：2017/12/27 11:34
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 *
 * @author Liu_xg
*/

public class BasePresenter<V extends BaseView, M extends BaseModel> {
    /**
     *  持有M层和V层，必须是要实现BaseView和BaseModel
     */
    public V mView;
    public M mModel;

    public void setPresenter(V view, M model) {
        mView = view;
        mModel = model;
    }

    public void setPresenter(V view) {
        mView = view;
    }

}
