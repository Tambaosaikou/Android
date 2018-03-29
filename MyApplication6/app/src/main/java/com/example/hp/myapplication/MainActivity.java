package com.example.hp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {//implements View.OnClickListener {

    Button btnLogin;
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        //给btnLogin增加监听器
        //btnLogin.setOnClickListener(this);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strName,strPwd;
                strName = username.getText().toString();
                strPwd = password.getText().toString();
                if (strName.equals("admin")&&strPwd.equals("admin")) {
                    Toast.makeText(MainActivity.this, "login!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }



    /*public void onClick(View v) {
        Toast.makeText(this,"login!!!",Toast.LENGTH_SHORT).show();
    }*/
}
