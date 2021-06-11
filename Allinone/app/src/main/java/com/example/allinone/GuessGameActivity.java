package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class GuessGameActivity extends AppCompatActivity {

    EditText ed;
    Button btn;
    TextView tv;
    ImageView iv;
    int rand;
    int num;
    int count= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_game);
        setImage();

    }

    public void onClicked(View v) {
        int rand = (int) (Math.random() * 98 + 1);
        //TextView tv= findViewById(R.id.textView2);
        // tv.setText(String.valueOf(rand ));
        ed = findViewById(R.id.editText);
        tv = findViewById(R.id.textView2);
       TextView tv1=findViewById(R.id.textView5);
        String s = ed.getText().toString();
        int num = Integer.parseInt(s);
        if (rand - num > 0) {
            tv.setText(R.string.Big);
           count++;
           tv1.setText(count);

        } else if (rand - num < 0) {
            tv.setText(R.string.Small);
            count++;
        } else {
            tv.setText(R.string.Cong);
            count++;
        }

    }
        private void setImage (){

            int rand = (int) (Math.random() * 98 + 1);
            ImageView  iv1=findViewById(R.id.imageView);

            switch (rand){
                case 1 -40:
                   iv1.setImageResource(R.drawable.cry);
                   break;

                case 41-98:
                    iv1.setImageResource(R.drawable.congratulation);
            }
        }
    }
