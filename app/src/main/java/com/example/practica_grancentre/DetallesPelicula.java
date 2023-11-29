package com.example.practica_grancentre;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetallesPelicula extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_pelicula);

        TextView titulo = (TextView) findViewById(R.id.tbTituloDescripcion);
        TextView detalles = (TextView) findViewById(R.id.tvdescripcion);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if(b!=null) {
            titulo.setText(b.getString("TIT"));
            detalles.setText(b.getString("DET"));
        }
    }
}
