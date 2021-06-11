package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText et;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickLogin(View v){
        tv=findViewById(R.id.tv1);
        et=findViewById(R.id.et1);
        et=findViewById(R.id.et2);
        btn=findViewById(R.id.btn);
      EditText ET=findViewById(R.id.et1);
       String input = ET.getText().toString();
        Intent intent = new Intent(this,SecondActivity.class);
       // intent.getStringExtra(input);
        intent.putExtra("hi",input);
        startActivity(intent);


    }
}
