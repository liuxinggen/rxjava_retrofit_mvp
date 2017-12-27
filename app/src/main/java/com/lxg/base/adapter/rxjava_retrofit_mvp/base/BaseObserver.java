package com.lxg.base.adapter.rxjava_retrofit_mvp.base;

import java.net.ConnectException;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * 类名： BaseObserver
 * 时间：2017/12/27 11:34
 * 描述：观察者
 * 修改人：
 * 修改时间：
 * 修改备注：
 *
 * @author Liu_xg
 */

public abstract class BaseObserver<T> implements Observer<BaseApi<T>> {

    @Override
    public void onSubscribe(@NonNull Disposable d) {

    }

    @Override
    public void onNext(@NonNull BaseApi<T> tBaseApi) {
        if (tBaseApi.getReason().equals("Success")) {
            handleData((T) tBaseApi.getResult().getData());
        } else {
            errorMsg("请求失败: " + tBaseApi.getError_code());
        }
    }

    @Override
    public void onError(@NonNull Throwable e) {
        if (e instanceof ConnectException) {
            errorMsg("无网络");
        }
        errorMsg(e.getMessage());
    }

    @Override
    public void onComplete() {
    }

    /**
     * @param t
     */
    public abstract void handleData(T t);

    /**
     * @param msg
     */
    public abstract void errorMsg(String msg);
}
