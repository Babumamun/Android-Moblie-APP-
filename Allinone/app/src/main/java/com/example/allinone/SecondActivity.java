package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        TextView tv=findViewById(R.id.tv3);
        Button but=findViewById(R.id.btn1);

        Intent intent= getIntent();
        String output= "Hi,"+intent.getStringExtra("hi")+" Welcome To Your Personal Apps Store";
        TextView tv2=findViewById(R.id.tv3);
        tv2.setText(output);

    }

    public void onClickRoshambo(View v){

       Intent rintent = new Intent(this,ActivityRoshambo.class);
        startActivity(rintent);
    }
    public void onClickGuessGame(View v){

        Intent intent = new Intent(this,GuessGameActivity.class);
        startActivity(intent);

    }
    public  void onClickedBeer( View v){
        Intent intent = new Intent(this,BeerActivity.class);
        startActivity(intent);
     }
     public void onClickedMessage(View v){
         Intent intent = new Intent(this,MessageActivity.class);
         startActivity(intent);
     }
}
