package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityRoshambo extends AppCompatActivity {


    ImageView pap;
    ImageView sci;
    TextView tv;
    Button btn;
    int count;
    int AWinCount;
    int BWinCount;
    int NoWinCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roshambo);

        pap = findViewById(R.id.iv1);
        sci = findViewById(R.id.iv2);
        tv = findViewById(R.id.tv1);
        tv = findViewById(R.id.tv2);
        tv=findViewById(R.id.textView);
    }

    private int play(ImageView iv) {
        int rand = (int) (Math.random() * 3 + 1);
        setImage(rand, iv);
        return rand;

    }

    private void setImage(int i, ImageView iv) {
        switch (i) {
            case 1:
                iv.setImageResource(R.drawable.paper);
                break;
            case 2:
                iv.setImageResource(R.drawable.scissors);
                break;
            case 3:
                iv.setImageResource(R.drawable.stone);
                break;
        }
    }

    public void onClickButton(View v) {
        TextView tv = findViewById(R.id.tv1);
        TextView tv1=findViewById(R.id.tv2);
        TextView tv2= findViewById(R.id.textView);
        String str = getResources().getString(R.string.win);
        tv.setText(whoWins(play(pap), play(sci)) + "" + str);
        tv1.setText("You have tried"+count+"times");
        String str1 = "Awin"+AWinCount+"times"+System.getProperty("line.separator")
            +"Bwin"+BWinCount+"times"+System.getProperty("line.separator")+"NOwin"+NoWinCount+"times";

        //tv2.setText("Awin"+AWinCount+"times" "Bwin"+BWinCount+"times" +"/nNOwin"+NoWinCount+"times");
         tv2.setText(str1);


    }

    private String whoWins(int X, int Y) {
        String win = null;
        int res = (X - Y + 3) % 3;
        switch (res) {
            case 0:
                win = "No";
                count++;
                NoWinCount++;
                break;
            case 1:
                win = "A";
                count++;
                AWinCount++;
                break;
            case 2:
                win = "B";
                count++;
                BWinCount++;
                break;


        }
        return win;

    }
}
