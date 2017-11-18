package com.aopk.mvplearn.model;

/**
 * Created by Administrator on 2017/11/18.
 */

public interface LoginPort {
    void login(String name,String pas,OnLoginListener listenter);
}
