package com.example.demoboxlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<BoxList> BoxList;

    public CustomAdapter(Context context, int resource, ArrayList<BoxList> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        BoxList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        ImageView ivBox1 = rowView.findViewById(R.id.imageView);

        BoxList currentBox = BoxList.get(position);
        if(currentBox.getColor()=='B') {
            ivBox1.setImageResource(R.drawable.blue_box);
        } else if (currentBox.getColor()=='O') {
            ivBox1.setImageResource(R.drawable.orange_box);
        } else {
            ivBox1.setImageResource(R.drawable.brown_box);
        }

        return rowView;
    }

}
