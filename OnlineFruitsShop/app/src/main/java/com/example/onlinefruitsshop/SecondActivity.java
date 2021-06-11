package com.example.onlinefruitsshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent= getIntent();
       int pos= intent.getIntExtra("position",0);
     DetailFragment detailFragment= (DetailFragment)
             getSupportFragmentManager().findFragmentById(R.id.fragment);
        //detailFragment.getString("I LOVE YOU APPLE");
        detailFragment.setIndex(pos);
    }


}
