package com.example.toplist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        ListView lv_food=findViewById(R.id.iv_food);
        Intent intent= new Intent();
        intent.getIntExtra("id",0);
        FoodAdapter foodAdapter=new FoodAdapter(this,
                R.layout.activity_food_category,Food.foods);
        lv_food.setAdapter(foodAdapter);
    }
}
