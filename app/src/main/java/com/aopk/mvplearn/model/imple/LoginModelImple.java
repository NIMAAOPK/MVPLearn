package com.aopk.mvplearn.model.imple;

import com.aopk.mvplearn.model.LoginPort;
import com.aopk.mvplearn.model.OnLoginListener;

/**
 * Created by Administrator on 2017/11/18.
 */

public class LoginModelImple  implements LoginPort{
    @Override
    public void login(String name, String pas, OnLoginListener listenter) {
        if (name.equals("admin")&&pas.equals("123")){
            listenter.onSuccess();
        }else{
            listenter.onMassageError();
        }
    }
}
