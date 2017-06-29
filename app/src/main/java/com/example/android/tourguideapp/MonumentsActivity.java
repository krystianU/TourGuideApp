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
        objects.add(new Object("Kosciuszko's Mound", "Jerzego Waszyngtona 1", "9:30 AM - 3:00 PM", R.drawable.photo_kosciuszko_mound));
        objects.add(new Object("Grunwald Monument", "Pl. Matejki", "All hours", R.drawable.photo_grunwald));
        objects.add(new Object("Adam Mickiewicz Monument", "Rynek Glowny", "All hours", R.drawable.photo_adam_mickiewicz));
        objects.add(new Object("Dzok Monument", "Vistula Walkway", "All hours", R.drawable.photo_dzok));
        objects.add(new Object("Eros Bound", "Rynek Glowny 1", "All hours", R.drawable.photo_eros_bound));
        objects.add(new Object("Monument of the Wawel Dragon", "Bulwar Czerwienski", "All hours", R.drawable.photo_wawel_dragon));
        objects.add(new Object("Statue of John Paul II", "Wawel 3", "All hours", R.drawable.photo_john_paul));
        objects.add(new Object("Monument of an abecedarian", "Maly Rynek", "All hours", R.drawable.photo_abecedarian));

        ObjectAdapter adapter = new ObjectAdapter(this, objects);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}