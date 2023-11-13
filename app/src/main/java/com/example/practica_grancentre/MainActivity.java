package com.example.practica_grancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
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
    }

    @Override
    public void onClick(View view) {
        
        if (view.getId() == R.id.img1)
        {
            Intent hotel = new Intent(this, activity_hotel.class);
            startActivity(hotel);
        } else if (view.getId() == R.id.img2) {
            
        } else if (view.getId() == R.id.img3) {
            
        } else if (view.getId() == R.id.img4) {
            
        }

    }
}