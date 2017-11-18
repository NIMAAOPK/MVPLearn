package com.aopk.mvplearn.model;

/**
 * Created by Administrator on 2017/11/18.
 */

public interface OnLoginListener {
    void onSuccess();
    void onFailure();
    void onMassageError();
}
