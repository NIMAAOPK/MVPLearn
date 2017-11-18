package com.aopk.mvplearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.aopk.mvplearn.presenter.LoginPresenter;
import com.aopk.mvplearn.view.LoginView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,LoginView{
    private EditText edtName, edtPassword;
    private Button btnLogin;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loginPresenter = new LoginPresenter(this);
    }

    private void initView() {
        edtName = (EditText) findViewById(R.id.edt_name);
        edtPassword = (EditText) findViewById(R.id.edt_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        loginPresenter.login();
    }

    @Override
    public String getUserName() {
        return edtName.getText().toString().trim();
    }

    @Override
    public String getUserPassword() {
        return edtPassword.getText().toString().trim();
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
