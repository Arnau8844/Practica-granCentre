package com.example.practica_grancentre;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class activity_hotel extends AppCompatActivity implements View.OnClickListener {
    Spinner s;

    ImageView img1, img2, img3;
    ImageView[] img;
    String[] hotelImg;
    String phoneNumber;

    LinearLayout linearLayoutHotel1;
    LinearLayout linearLayoutHotel2;
    LinearLayout linearLayoutHotel3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        iniciarSpinner();

        TextView textViewPhoneNumber = findViewById(R.id.textViewPhoneNumberHotel1);
        textViewPhoneNumber.setOnClickListener(this);

        img1 = this.findViewById(R.id.img1);
        img2 = this.findViewById(R.id.img2);
        img3 = this.findViewById(R.id.img3);
        img = new ImageView[]{img1,img2,img3};

        hotelImg = new String[]{
                "https://www.ahstatic.com/photos/6410_ho_00_p_1024x768.jpg",
                "data:image/jpeg;base64,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",
                "data:image/jpeg;base64,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"
        };
        carregarImgs();
        filterWithTheSpinner();
    }


    private void filterWithTheSpinner() {
        linearLayoutHotel1 = findViewById(R.id.hotel1);
        linearLayoutHotel2 = findViewById(R.id.hotel2);
        linearLayoutHotel3 = findViewById(R.id.hotel3);
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                updateLayoutVisibility(selectedItem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Do nothing here
            }
        });
    }

    private void updateLayoutVisibility(String selectedItem) {
        if (!selectedItem.equals("No filter")){
            if (selectedItem.equals(linearLayoutHotel1.getTag().toString())) {
                linearLayoutHotel1.setVisibility(View.VISIBLE);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayoutHotel1.getLayoutParams();
                layoutParams.height = 480;
                linearLayoutHotel1.setLayoutParams(layoutParams);
            }
            else{
                linearLayoutHotel1.setVisibility(View.INVISIBLE);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayoutHotel1.getLayoutParams();
                layoutParams.height = 0;
                linearLayoutHotel1.setLayoutParams(layoutParams);
            }
            if (selectedItem.equals(linearLayoutHotel2.getTag().toString())) {
                linearLayoutHotel2.setVisibility(View.VISIBLE);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayoutHotel2.getLayoutParams();
                layoutParams.height = 480;
                linearLayoutHotel2.setLayoutParams(layoutParams);
            }
            else{
                linearLayoutHotel2.setVisibility(View.INVISIBLE);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayoutHotel2.getLayoutParams();
                layoutParams.height = 0;
                linearLayoutHotel2.setLayoutParams(layoutParams);
            }
            if (selectedItem.equals(linearLayoutHotel3.getTag().toString())) {
                linearLayoutHotel3.setVisibility(View.VISIBLE);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayoutHotel3.getLayoutParams();
                layoutParams.height = 480;
                linearLayoutHotel3.setLayoutParams(layoutParams);
            }
            else{
                linearLayoutHotel3.setVisibility(View.INVISIBLE);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayoutHotel3.getLayoutParams();
                layoutParams.height = 0;
                linearLayoutHotel3.setLayoutParams(layoutParams);
            }
        }
        else{
            linearLayoutHotel1.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayoutHotel1.getLayoutParams();
            layoutParams.height = 480;
            linearLayoutHotel1.setLayoutParams(layoutParams);
            linearLayoutHotel2.setVisibility(View.VISIBLE);
            layoutParams = (LinearLayout.LayoutParams) linearLayoutHotel2.getLayoutParams();
            layoutParams.height = 480;
            linearLayoutHotel2.setLayoutParams(layoutParams);
            linearLayoutHotel3.setVisibility(View.VISIBLE);
            layoutParams = (LinearLayout.LayoutParams) linearLayoutHotel3.getLayoutParams();
            layoutParams.height = 480;
            linearLayoutHotel3.setLayoutParams(layoutParams);
        }

    }

    private void iniciarSpinner() {
        String[] arraySpinner = new String[] {"No filter","2 Estrellas", "3 Estrellas","4 Estrellas", "5 Estrellas"};
        s = (Spinner) findViewById(R.id.itemList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
    }

    private void carregarImgs() {
        for (int i = 0; i < img.length; i++) {
            if (hotelImg != null && hotelImg.length > i && img[i] != null) {
                Glide.with(this)
                        .load(hotelImg[i])
                        .into(img[i]);

            }
        }
    }
    public void makePhoneCall(View view) {
        // Obtiene el número de teléfono del TextView
        if (view.getId() == R.id.textViewPhoneNumberHotel1) {
            TextView textViewPhoneNumber = findViewById(R.id.textViewPhoneNumberHotel1);
            String tel = textViewPhoneNumber.getText().toString();
            Intent dialIntent = new Intent(Intent.ACTION_DIAL);
            dialIntent.setData(Uri.parse("tel:" + tel));

            // Agrega esta línea para iniciar la actividad de marcado telefónico
            startActivity(dialIntent);
        }
    }


    @Override
    public void onClick(View view) {

    }
}