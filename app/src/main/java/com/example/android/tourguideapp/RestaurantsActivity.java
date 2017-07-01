package com.example.android.tourguideapp;


import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
/**
 * Created by tit0 on 27.06.2017.
 */

public class RestaurantsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_list);

    final ArrayList<Object> objects = new ArrayList<Object>();
        objects.add(new Object(getString(R.string.restaurants_object_1_name), getString(R.string.restaurants_object_1_street), getString(R.string.restaurants_object_1_info)));
        objects.add(new Object(getString(R.string.restaurants_object_2_name), getString(R.string.restaurants_object_2_street), getString(R.string.restaurants_object_2_info)));
        objects.add(new Object(getString(R.string.restaurants_object_3_name), getString(R.string.restaurants_object_3_street), getString(R.string.restaurants_object_3_info)));
        objects.add(new Object(getString(R.string.restaurants_object_4_name), getString(R.string.restaurants_object_4_street), getString(R.string.restaurants_object_4_info)));
        objects.add(new Object(getString(R.string.restaurants_object_5_name), getString(R.string.restaurants_object_5_street), getString(R.string.restaurants_object_5_info)));
        objects.add(new Object(getString(R.string.restaurants_object_6_name), getString(R.string.restaurants_object_6_street), getString(R.string.restaurants_object_6_info)));
        objects.add(new Object(getString(R.string.restaurants_object_7_name), getString(R.string.restaurants_object_7_street), getString(R.string.restaurants_object_7_info)));
        objects.add(new Object(getString(R.string.restaurants_object_8_name), getString(R.string.restaurants_object_8_street), getString(R.string.restaurants_object_8_info)));

        ObjectAdapter adapter = new ObjectAdapter(this, objects);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}