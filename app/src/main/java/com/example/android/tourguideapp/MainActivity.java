package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView restaurants = (TextView) findViewById(R.id.text_view_restaurants);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });
        TextView museums = (TextView) findViewById(R.id.text_view_museums);
        museums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent museumsIntent = new Intent(MainActivity.this, MuseumsActivity.class);
                startActivity(museumsIntent);
            }
        });
        TextView monuments = (TextView) findViewById(R.id.text_view_monuments);
        monuments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent monumentsIntent = new Intent(MainActivity.this, MonumentsActivity.class);
                startActivity(monumentsIntent);
            }
        });
        TextView nightLife = (TextView) findViewById(R.id.text_view_night_life);
        nightLife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nightLifeIntent = new Intent(MainActivity.this, NightLifeActivity.class);
                startActivity(nightLifeIntent);
            }
        });
    }
}
