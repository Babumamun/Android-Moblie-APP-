package com.example.toplist;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class FoodAdapter extends ArrayAdapter<Food> {
    private Context context;
    private int resourceId;

    public FoodAdapter(Context context, int resource,Food[]foods) {
        super(context, resource,foods);
        this.context=context;
        this.resourceId=resource;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View v= View.inflate(context, resourceId, null);
        Food foods= getItem(position);
        ImageView hab=v.findViewById(R.id.im_hab);
        TextView han_name=v.findViewById(R.id.tv_name1);
        TextView tv_price=v.findViewById(R.id.tv_price);
        hab.setImageResource(foods.getImId());
        han_name.setText(foods.getFname());
        tv_price.setText(foods.getPrice());
        return v;
    }
}
