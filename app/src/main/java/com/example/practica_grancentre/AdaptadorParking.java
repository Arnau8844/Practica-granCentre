package com.example.practica_grancentre;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

public class AdaptadorParking extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context contexto;
    String[][] datos;

    public AdaptadorParking(Context conexto, String[][] datos)
    {
        this.contexto = conexto;
        this.datos = datos;

        inflater = (LayoutInflater)conexto.getSystemService(conexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        final View vista = inflater.inflate(R.layout.elemento_llista_parking, null);

        TextView titulo = (TextView) vista.findViewById(R.id.tvTitulo);
        TextView direccion = (TextView) vista.findViewById(R.id.tvDireccio);
        TextView tipo = (TextView) vista.findViewById(R.id.tvTipo);
        TextView capacidad = (TextView) vista.findViewById(R.id.tvCapacidad);
        RatingBar calificacion = (RatingBar) vista.findViewById(R.id.ratingBarPel);

        titulo.setText(datos[i][0]);
        tipo.setText("Tipo: " + datos[i][1]);
        capacidad.setText("Disponibilidad: " + datos[i][2]);
        direccion.setText("Direccion: " + datos[i][3]);
        calificacion.setProgress(Integer.valueOf(datos[i][4]));

        return vista;
    }

    @Override
    public int getCount() {

        return datos.length;
    }

    @Override
    public Object getItem(int position) {

        return datos[position];
    }

    @Override
    public long getItemId(int position) {

        return position;
    }
}
