package com.example.roshambo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView pa;
    ImageView sci;
    //ImageView sto;
    //int play;
    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pa = findViewById(R.id.im1);
        sci = findViewById(R.id.im2);
        //sto = findViewById(R.id.)
        tv = findViewById(R.id.tv1);
        btn = findViewById(R.id.button);


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



    public void onClicked(View v) {
        TextView tv = findViewById(R.id.tv1);
        String str = getResources().getString(R.string.win);
        tv.setText(whoWins(play(pa),play(sci)) + "" + str);
    }

    private String whoWins(int X, int Y) {
        String win = null;
        int res = (X - Y + 3) % 3;
        switch (res) {
            case 0:
                win = "No";
                break;
            case 1:
                win = "A";
                break;
            case 2:
                win = "B";
                break;

        }
        return win;

    }
}
