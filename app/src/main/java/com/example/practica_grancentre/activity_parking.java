package com.example.practica_grancentre;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_parking extends AppCompatActivity {

    ListView lista;

    String[][] datos = {
            {"Aparcament de Granollers", "Aparcamiento exterior","50/80", "Camí Ramon Llull, 32, 08401 Granollers, Barcelona", "3"},
            {"Aparcament públic", "Aparcamiento exterior Gratuit", "80/100", "08402 Granollers, Barcelona", "5"},
            {"Parquing el Sot", "Aparcamiento interior", "110/150", "Plaça Josep Barangé Bachs, 08402 Granollers, Barcelona", "4"},
            {"Garatge Sant Carles", "Garage interior", "20/40", "C/ de Pompeu Fabra, 6, 08401 Granollers, Barcelona", "3"}
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);

        lista = (ListView) findViewById(R.id.lvParking);

        lista.setAdapter(new AdaptadorParking(this, datos));
    }
}