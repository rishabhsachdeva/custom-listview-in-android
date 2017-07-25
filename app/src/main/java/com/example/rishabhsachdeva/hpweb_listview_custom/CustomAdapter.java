package com.example.rishabhsachdeva.hpweb_listview_custom;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String>{
    String[] name1;
    Integer[] img1;
    private final Activity context;


    public CustomAdapter(Activity context, String[] name, Integer[] img) {
        super(context,R.layout.activity_listview,name);
        this.context=context;
        name1=name;
        img1=img;
    }
    public View getView(int position, View view,ViewGroup parent )
    {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_listview, null, true);

        TextView tvContent = (TextView) rowView.findViewById(R.id.textView);
        ImageView ivImage = (ImageView) rowView.findViewById(R.id.imageView);

        tvContent.setText(name1[position]);
        ivImage.setImageResource(img1[position]);
        return rowView;
    }

}
