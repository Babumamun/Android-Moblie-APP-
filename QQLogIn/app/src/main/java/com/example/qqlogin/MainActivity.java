package com.example.qqlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText phone_id,pass;
    Button btn;
    String phone,pas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phone_id=findViewById(R.id.edit_name);
        pass=findViewById(R.id.editText_pass);
        btn= findViewById(R.id.btn_login);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,SecondActivity.class);
                phone= phone_id.getText().toString();
                pas=pass.getText().toString();
                intent.putExtra("phone or id",phone);
                intent.putExtra("password",pas);
                startActivity(intent);
                finish();
            }
        });
    }
}
