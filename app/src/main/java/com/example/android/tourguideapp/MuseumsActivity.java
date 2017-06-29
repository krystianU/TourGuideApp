package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tit0 on 27.06.2017.
 */

public class MuseumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_list);
        final ArrayList<Object> objects = new ArrayList<Object>();
        objects.add(new Object("Polish Aviation Museum", "Jana Pawla II 39", "9:00 AM - 5:00 PM"));
        objects.add(new Object("Oskar Schindler's Factory", "Lipowa 4", "10:00 AM - 7:00 PM"));
        objects.add(new Object("Stained Glass Museum", "Zygmunta Krasinskiego 23", "11:30 AM - 6:00 PM"));
        objects.add(new Object("Cracow Historical Museum - Old Market Underground", "Rynek Glowny 1", "10:00 AM - 8:00 PM"));
        objects.add(new Object("Jagiellonian University - Collegium Maius", "Jagiellonska 15", "10:00 AM - 2:15 PM"));
        objects.add(new Object("Galicia Jewish Museum", "Dajwor 18", "10:00 AM - 6:00 PM"));
        objects.add(new Object("MOCAK Museum of Contemporary Art in Krakow", "Lipowa 4", "11:00 AM - 7:00 PM"));
        objects.add(new Object("National Museum", "3 maja 1", "10:00 AM - 6:00 PM"));

        ObjectAdapter adapter = new ObjectAdapter(this, objects);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}