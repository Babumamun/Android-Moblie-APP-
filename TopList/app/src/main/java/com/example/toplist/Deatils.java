package com.example.toplist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Deatils extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatils);

        Intent intent = getIntent();
        int item=intent.getIntExtra("item",0);
        ImageView imageView= findViewById(R.id.image);
        TextView name = findViewById(R.id.tv_name1);
        TextView deatils =findViewById(R.id.tv_deatils);
       name.setText(Drink.drinks[item].getName());
       deatils.setText(Drink.drinks[item].getDsce());
       imageView.setImageResource(Drink.drinks[item].getImgId());
    }
}
