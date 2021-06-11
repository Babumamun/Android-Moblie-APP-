package com.example.who;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int  count = 0;
    private boolean running= true;
    String [] students = new String[15];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0;i<students.length;i++){
            students[i]="183801200"+String.format("%02d",i+1);
        }
        runTimer();
    }

  private void runTimer(){
        final Handler handler= new Handler();
        final TextView tv= findViewById(R.id.tv);
        handler.post(new Runnable() {
            @Override
            public void run() {
                int index = count % students.length;
                String number = students[index];
                tv.setText(number);
                if (running) {

                    count++;
                }
                handler.postDelayed(this,1000);
            }
        });
      }

    public void onClickStart(View v){
        running =true;
    }
   public void onClickStop(View v){
        running=false;
   }
   public void onClickRestart(View v){
       running =true;
       count=0;
   }
  }


