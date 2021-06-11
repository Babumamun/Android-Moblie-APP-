package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private int seconds =0;
    EditText et1;
    private boolean running = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState!= null){
            seconds= savedInstanceState.getInt("sec");
            running=savedInstanceState.getBoolean("state");
        }
        runTimer();
    }
    public void onClickStart(View v){
        running = true;
    }


    public void onClickStop(View v){
        running = false;
    }

    public void onClickReset(View v){
        running = true;
        seconds = 0;

    }
    @Override
     protected void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);

        outState.putInt("Second",seconds);
        outState.putBoolean("sate",running);
    }




    private void runTimer(){
        final Handler handler = new Handler();
        final EditText et1= findViewById(R.id.et1);
        handler.post(new Runnable() {
            @Override
            public void run() {
                // to display the  time every seconed
                int h = seconds/3600;
                int m = (seconds%3600)/60;
                int s = seconds%60;
                String time = String.format("%02d:%02d:%02d",h,m,s);

                et1.setText(time);
                if(running)
                seconds ++;
                handler.postDelayed(this,1000);

            }
        });
    }
}
