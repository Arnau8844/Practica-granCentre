package com.example.practica_grancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.img1)
        {
            Intent hotel = new Intent(this, activity_hotel.class);
            startActivity(hotel);
        } else if (view.getId() == R.id.img2) {
            Intent restaurant = new Intent(this, activity_restaurant.class);
            startActivity(restaurant);
        } else if (view.getId() == R.id.img3) {
            Intent transport = new Intent(this, activity_parking.class);
            startActivity(transport);
        } else if (view.getId() == R.id.img4) {
            Intent cine = new Intent(this, activity_cine.class);
            startActivity(cine);
        }

    }
}