package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;


public class EnrollActicity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eoroll);

        //按钮：确定
        Button confirm = (Button)findViewById(R.id.confirm_button);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转至登录界面
                Intent i = new Intent(EnrollActicity.this, UserLoginActivity.class);//跳转至登录界面
                //启动
                startActivity(i);

            }
        });

        //按钮：获取验证码
        Button getcode = (Button)findViewById(R.id.get_code);
        getcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*****此处获取验证码界面缺失******/
            }
        });


        //按钮：已有账号？直接登录
        Button return_login = (Button)findViewById(R.id.return_login);
        return_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Intent是一种运行时绑定（run-time binding）机制，它能在程序运行过程中连接两个不同的组件。
                //在存放资源代码的文件夹下下，
                Intent i = new Intent(EnrollActicity.this, UserLoginActivity.class);//跳转至登录界面
                //启动
                startActivity(i);
            }
        });


    }
}
