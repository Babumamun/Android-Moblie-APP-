package com.example.toplist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ListView;

public class FruitCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_category);
        ListView listView=findViewById(R.id.list_view);
        Intent intent= new Intent();
        intent.getIntExtra("id",0);
        FruitAdapter fruitAdapter=new FruitAdapter
                (this,R.layout.fruit_item,Service.fruits);
        listView.setAdapter(fruitAdapter);

    }
}
