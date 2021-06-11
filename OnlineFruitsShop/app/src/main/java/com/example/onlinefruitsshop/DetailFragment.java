package com.example.onlinefruitsshop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailFragment extends Fragment {
     int index;
    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();

        TextView tv_name=view.findViewById(R.id.tv_name);
        TextView tv_price= view.findViewById(R.id.tv_price);
        ImageView imageView= view.findViewById(R.id.imageView);
        tv_name.setText(Fruits.fruits[index].getName());
        tv_price.setText(Fruits.fruits[index].getPrice());
        imageView.setImageResource(Fruits.fruits[index].getImgId());


        //     TextView title = (TextView) view.findViewById(R.id.tv);
//            Workout workout = Workout.workouts[(int) workoutId];
//            title.setText(workout.getName());
//            TextView description = (TextView) view.findViewById(R.id.textDescription);
             //title.setText(str);

        }

        public  void setIndex(int pos){
            index= pos;
        }



}






