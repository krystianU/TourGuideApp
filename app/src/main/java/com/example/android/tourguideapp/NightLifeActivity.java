package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by tit0 on 27.06.2017.
 */

public class NightLifeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_list);

        ArrayList<Object> objects = new ArrayList<Object>();
        objects.add(new Object("Wodka Cafe Bar", "Mikolajska 5", "1:00 PM - Last client"));
        objects.add(new Object("Cafe Philo", "Sw. Tomasza 30", "All hours"));
        objects.add(new Object("House of Beer", "Sw. Tomasza 35", "2:00 PM - 2:00 AM"));
        objects.add(new Object("Alchemia", "Estery 5", "8:00 AM - 11:00 PM"));
        objects.add(new Object("Mercy Brown Dive Bar", "Floriana Straszewskiego 28", "7:00 PM - 2:00 AM"));
        objects.add(new Object("Frantic Club", "Szewska 5", "10:00 PM - 5:00 AM"));
        objects.add(new Object("Shakers Club", "Szewska 5", "10:00 PM - 03:00 AM"));
        objects.add(new Object("Alternatywy Club", "Maly Rynek 4", "6:00 PM - 2:00 AM"));

        ObjectAdapter adapter = new ObjectAdapter(this, objects);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}