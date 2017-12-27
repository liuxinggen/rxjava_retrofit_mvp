package com.lxg.base.adapter.rxjava_retrofit_mvp.base;

import com.trello.rxlifecycle2.LifecycleTransformer;

/**
 * 类名： BaseView
 * 时间：2017/12/27 11:35
 * 描述：
 * 修改人：
 * 修改时间：
 * 修改备注：
 *
 * @author Liu_xg
*/

public interface BaseView {
    /**
     * 为了防止内存泄漏的风险，使用了第三方库rxlifecycle
     * @return
     */
    LifecycleTransformer bindLifecycle();
}
