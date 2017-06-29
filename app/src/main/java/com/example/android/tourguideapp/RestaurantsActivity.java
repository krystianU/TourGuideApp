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
        objects.add(new Object("Starka", "Jozefa 14", "12 AM - 11:00 PM"));
        objects.add(new Object("Stylowa", "Centrum C3", "09:00 AM- 23:00 PM"));
        objects.add(new Object("Pod Aniolami", "Grodzka 35", "1:00 PM - 12:00 AM"));
        objects.add(new Object("Pod Wawelem-Kompania Kuflow", "Św. Gertrudy 26-29", "12:00 PM - 12:00 AM"));
        objects.add(new Object("Dawno Temu na Kazimierzu", "Szeroka 1", "10:00 AM - 12:00 AM"));
        objects.add(new Object("Cyrano de Bergerac", "Sławkowska 26", "12:00 PM - 11:00 PM"));
        objects.add(new Object("Café Oranzeria", "Plac Kossaka 1", "10:00 AM - 11:00 PM"));
        objects.add(new Object("Alebriche", "Karmelicka 56", "10:00 AM - 10:00 PM"));

        ObjectAdapter adapter = new ObjectAdapter(this, objects);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}