package com.example.qqlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView userid,userpass;
String id, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        userid=findViewById(R.id.tv_userId);
        userpass=findViewById(R.id.user_pass);
        id=getIntent().getExtras().getString("phone or id");
        password=getIntent().getExtras().getString("password");
        userid.setText("Hey Pengyou Your ID is:"+id);

        userpass.setText("And Your Password is:"+password);
    }
}
