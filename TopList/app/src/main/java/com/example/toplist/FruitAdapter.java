package com.example.toplist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class FruitAdapter extends ArrayAdapter<Fruit>  {
  private Context context;
  private int resourceId;

    public FruitAdapter(Context context, int resource,
                        Fruit[] fruitArrayList ) {
        super(context, resource, fruitArrayList);
        this.context=context;
        this.resourceId=resource;
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        View v= View.inflate(context,resourceId,null);
        Fruit fruit= (Fruit) getItem(position);
        TextView tv_name=  v.findViewById(R.id.tv_n);
        TextView tv_price=v.findViewById(R.id.tv_p);
        ImageView imageView=v.findViewById(R.id.im_viw);
      tv_name.setText(fruit.getName());
      tv_price.setText(fruit.getPrice());
      imageView.setImageResource(fruit.imgId);

        return v;
    }


}
