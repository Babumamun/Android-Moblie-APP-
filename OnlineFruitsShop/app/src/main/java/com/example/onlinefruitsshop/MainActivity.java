package com.example.onlinefruitsshop;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
//import android.support.v7.widget.ShareActionProvider;
//import android.support.v4.view.MenuItemCompat;


public class MainActivity extends AppCompatActivity {

    private ShareActionProvider shareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView listView= findViewById(R.id.list_item);
        ArrayAdapter arrayAdapter=  new ArrayAdapter
                (this,android.R.layout.simple_list_item_1, Fruits.fruits);


        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent  intent= new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("position",position);
                startActivity(intent);
//                Intent  intent= new Intent(getApplicationContext(),SecondActivity.class);
//                startActivity(intent);
//                Toast.makeText(getApplicationContext(),
//                        " This  position is "+position,Toast.LENGTH_LONG).show();
            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.mymenu,menu);
        MenuItem menuItem= menu.findItem(R.id.share);
        shareActionProvider =(ShareActionProvider)
                MenuItemCompat.getActionProvider(menuItem);
        setShareActionIntent("U get over there fresh fruits");
        return super.onCreateOptionsMenu(menu);

    }

    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()){
            case R.id.create_order:
                Intent  intent= new Intent(this,OrderActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
    private void setShareActionIntent(String text) {
        Intent intent= new Intent(Intent.ACTION_SEND);
        intent.setType("text/plane");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        shareActionProvider.setShareIntent(intent);

    }
}
