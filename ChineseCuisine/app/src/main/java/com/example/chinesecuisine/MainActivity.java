package com.example.chinesecuisine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickFindView(View view) {
        Spinner cuisine=findViewById(R.id.spiner_cuisine);
        String s = String.valueOf(cuisine.getSelectedItem());
        TextView msg = findViewById(R.id.tv_msg);
        switch (s){
            case " Beijing Roast Duck":
                msg.setText("北京烤鸭"+"\n "+"Beijing Roast Duck");
                break;
            case "Noodles":
                msg.setText("面条 "+"\n "+"Noodles ");
                break;
            case "Hot pot":
                msg.setText("火锅"+"\n "+"Hot pot");
                break;
            case "Rice cake pork":
                msg.setText("年糕红烧肉"+"\n "+"Rice cake pork");
                break;
        }



        }
    }

