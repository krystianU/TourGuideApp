package com.example.android.tourguideapp;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tit0 on 20.05.2017.
 */

public class ObjectAdapter extends ArrayAdapter<Object> {


    public ObjectAdapter(Activity context, ArrayList<Object> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.content_list, parent, false);
        }

        Object currentObject = getItem(position);

        TextView objectNameTextView = (TextView) listItemView.findViewById(R.id.object_name_text_view);
        objectNameTextView.setText(currentObject.getObjectName());

        TextView objectStreetTextView = (TextView) listItemView.findViewById(R.id.object_street_text_view);
        objectStreetTextView.setText(currentObject.getObjectStreet());

        TextView objectInfo1 = (TextView) listItemView.findViewById(R.id.object_info1_text_view);
        objectInfo1.setText(currentObject.getObjectInfo1());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentObject.hasImage()) {
            imageView.setImageResource((currentObject.getImageResourceId()));
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
