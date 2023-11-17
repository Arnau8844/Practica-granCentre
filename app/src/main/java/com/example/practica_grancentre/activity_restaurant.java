package com.example.practica_grancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class activity_restaurant extends AppCompatActivity {
    Spinner s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        iniciarSpinner();
    }

    private void iniciarSpinner() {
        String[] arraySpinner = new String[] {
                "Japones", "Italiano", "Mexicano",
        };
        s = (Spinner) findViewById(R.id.itemList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
    }
}