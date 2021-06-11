package com.example.toplist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CategoryActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagory);
        ListView lv=findViewById(R.id.iv_product);
        Intent intent= new Intent();
        intent.getIntExtra("id",0);
      //iniitiaoze
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_list_item_1,Drink.drinks);
      // bind the
      lv.setAdapter(aa);
      lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        Toast.makeText(CategoryActivity.this, "Position is:" + position, Toast.LENGTH_LONG).show();

        Intent intent= new Intent(getApplicationContext(),Deatils.class);
        intent.putExtra("item",position);
        startActivity(intent);
    }
}
