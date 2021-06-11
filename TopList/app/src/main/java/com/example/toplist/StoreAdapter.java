package com.example.toplist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class StoreAdapter extends ArrayAdapter<Store> {

    private Context context;
    private int resourceId;

    public StoreAdapter(Context context, int resource, Store[] stores) {
        super(context, resource, stores);
        this.context = context;
        this.resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, resourceId, null);
        Store store=getItem(position);
        ImageView img= v.findViewById(R.id.im_shop);
        TextView tv_name= v.findViewById(R.id.tv_name1);
        TextView tv_phn=v.findViewById(R.id.tv_phn);
        TextView tv_address=v.findViewById(R.id.tv_adress);
        img.setImageResource(store.getImgId());
        tv_name.setText(store.getName());
        tv_phn.setText(store.getPhone());
        tv_address.setText(store.getAddress());
        return v;


    }
}
