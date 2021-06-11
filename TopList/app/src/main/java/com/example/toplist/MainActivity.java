package com.example.toplist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv_option = findViewById(R.id.list_view_id);
        lv_option.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(getApplicationContext(), CategoryActivity.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        break;

                    case 1:
                        intent = new Intent(getApplicationContext(), FoodActivity.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), StoreCategoryActivity.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), FruitCategoryActivity.class);
                        intent.putExtra("id", position);
                        startActivity(intent);
                        break;
                }

            }
        });
    }
}
