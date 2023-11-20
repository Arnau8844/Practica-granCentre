package com.example.practica_grancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.bumptech.glide.Glide;

public class activity_restaurant extends AppCompatActivity {
    Spinner s;
    ImageView img1, img2, img3;
    String[] restaruantImg;
    ImageView[] img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        img1 = this.findViewById(R.id.img1);
        img2 = this.findViewById(R.id.img2);
        img3 = this.findViewById(R.id.img3);
        img = new ImageView[]{img1, img2, img3};
        restaruantImg = new String[]{
                "https://asset1.zankyou.com/images/wervice-card-big/88b/d528/1050/800/w/730001/-/1639147371.jpg",
                "https://app.pidepaya.com/wp-content/uploads/185658612_1929000710592237_2196111832220563407_n.jpg",
                "https://media-cdn.tripadvisor.com/media/photo-s/08/bb/5c/f5/italo-s-pizza.jpg"};
        iniciarSpinner();
        carregarImgs();
    }

    private void carregarImgs() {
        for (int i = 0; i < img.length; i++)
        Glide.with(this)
                .load(restaruantImg[i])
                .into(img[i]);
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