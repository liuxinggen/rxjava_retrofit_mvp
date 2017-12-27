package com.lxg.base.adapter.rxjava_retrofit_mvp.net.callback;

/**
 * 类名： Callback
 * 时间：2017/12/27 11:36
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 *
 * @author Liu_xg
*/

public interface Callback<T> {
    void success(T t);

    void fail(String msg);
}
