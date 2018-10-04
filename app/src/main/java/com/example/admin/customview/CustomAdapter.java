package com.example.admin.customview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private String []arr;
    private int []imag;
    private String []tempera;
    private String []arr1;
    private String []info;

    public CustomAdapter(Context context, String[] arr, int[] imag,String[] arr1,String[] tempera) {
        this.context=context;
        this.arr=arr;
        this.imag=imag;
        this.tempera=tempera;
        this.arr1=arr1;
    }

    @Override
    public int getCount() {
        return arr.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View customView;

        view =  LayoutInflater.from(context).inflate(R.layout.activity_custom_view,viewGroup,false);
        TextView cities = view.findViewById(R.id.txt1);

        ImageView image = view.findViewById(R.id.image1);

        TextView climate=view.findViewById(R.id.txt2);

        TextView temperature=view.findViewById(R.id.txt3);

        image.setImageResource(imag[i]);

        cities.setText(arr[i]);

        climate.setText(arr1[i]);

        temperature.setText(tempera[i]);

        customView = view;

        return customView;
    }
}
