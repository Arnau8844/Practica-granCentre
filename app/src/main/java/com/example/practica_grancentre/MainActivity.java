package com.example.practica_grancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton bt1 = findViewById(R.id.bt1);
        ImageButton bt2 = findViewById(R.id.bt2);
        ImageButton bt3 = findViewById(R.id.bt3);
        ImageButton bt4 = findViewById(R.id.bt4);
    }

    @Override
    public void onClick(View view) {
        
        if (view.getId() == R.id.bt1)
        {

        } else if (view.getId() == R.id.bt2) {
            
        } else if (view.getId() == R.id.bt3) {
            
        } else if (view.getId() == R.id.bt4) {
            
        }

    }
}