package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tit0 on 27.06.2017.
 */

public class MonumentsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_list);

        final ArrayList<Object> objects = new ArrayList<Object>();
        objects.add(new Object(getString(R.string.monuments_object_1_name), getString(R.string.monuments_object_1_street), getString(R.string.monuments_object_1_info), R.drawable.photo_kosciuszko_mound));
        objects.add(new Object(getString(R.string.monuments_object_2_name), getString(R.string.monuments_object_2_street), getString(R.string.monuments_object_2_info), R.drawable.photo_grunwald));
        objects.add(new Object(getString(R.string.monuments_object_3_name), getString(R.string.monuments_object_3_street), getString(R.string.monuments_object_3_info), R.drawable.photo_adam_mickiewicz));
        objects.add(new Object(getString(R.string.monuments_object_4_name), getString(R.string.monuments_object_4_street), getString(R.string.monuments_object_4_info), R.drawable.photo_dzok));
        objects.add(new Object(getString(R.string.monuments_object_5_name), getString(R.string.monuments_object_5_street), getString(R.string.monuments_object_5_info), R.drawable.photo_eros_bound));
        objects.add(new Object(getString(R.string.monuments_object_6_name), getString(R.string.monuments_object_6_street), getString(R.string.monuments_object_6_info), R.drawable.photo_wawel_dragon));
        objects.add(new Object(getString(R.string.monuments_object_7_name), getString(R.string.monuments_object_7_street), getString(R.string.monuments_object_7_info), R.drawable.photo_john_paul));
        objects.add(new Object(getString(R.string.monuments_object_8_name), getString(R.string.monuments_object_8_street), getString(R.string.monuments_object_8_info), R.drawable.photo_abecedarian));

        ObjectAdapter adapter = new ObjectAdapter(this, objects);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}