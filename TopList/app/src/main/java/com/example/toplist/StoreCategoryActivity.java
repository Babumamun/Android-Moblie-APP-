package com.example.toplist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

public class StoreCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_category);
        ListView iv_store= findViewById(R.id.lv_store);
        Intent intent= new Intent();
        intent.getIntExtra("id",0);
        StoreAdapter storeAdapter = new StoreAdapter(this,
                R.layout.activity_store, Store.stores);
        iv_store.setAdapter(storeAdapter);
    }
}
