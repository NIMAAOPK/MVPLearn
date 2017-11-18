package com.aopk.mvplearn.presenter;

import com.aopk.mvplearn.model.OnLoginListener;
import com.aopk.mvplearn.model.imple.LoginModelImple;
import com.aopk.mvplearn.view.LoginView;

/**
 * Created by Administrator on 2017/11/18.
 */

public class LoginPresenter implements OnLoginListener {
    private LoginView loginView;
    private LoginModelImple loginModelImple;

    public LoginPresenter(LoginView loginView) {
        this.loginView = loginView;
        loginModelImple = new LoginModelImple();
    }

    public void login(){
        String name = loginView.getUserName();
        String password = loginView.getUserPassword();
        loginModelImple.login(name,password,this);
    }

    @Override
    public void onSuccess() {
        loginView.showToast("success");
    }

    @Override
    public void onFailure() {
        loginView.showToast("onFailure");
    }

    @Override
    public void onMassageError() {
        loginView.showToast("onMassageError");
    }
}
