package com.example.practica_grancentre;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class activity_restaurant extends AppCompatActivity implements View.OnClickListener {
    Spinner s;
    ImageView img1, img2, img3;
    String[] restaruantImg;
    ImageView[] img;
    TextView direccio1;
    TextView direccio2;
    TextView direccio3;
    TextView[] direccions;
    String[] textDireccions;
    TextView telefon1;
    TextView telefon2;
    TextView telefon3;
    TextView[] telefons;
    TextView paginaWeb1;
    TextView paginaWeb2;
    TextView paginaWeb3;
    TextView[] paginasWeb;
    String[] textTelefons;
    SpannableString lineaDireccio;
    SpannableString lineaTelefon;
    LinearLayout linearLayoutRestaurant1;
    LinearLayout linearLayoutRestaurant2;
    LinearLayout linearLayoutRestaurant3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        //imagenes
        img1 = this.findViewById(R.id.img1);
        img2 = this.findViewById(R.id.img2);
        img3 = this.findViewById(R.id.img3);
        img = new ImageView[]{img1, img2, img3};
        //direccions
        direccio1 = (TextView) findViewById(R.id.direccio1);
        direccio2 = (TextView) findViewById(R.id.direccio2);
        direccio3 = (TextView) findViewById(R.id.direccio3);
        direccions = new TextView[]{direccio1,direccio2,direccio3};
        //telefons
        textDireccions = new String[]{  this.getResources().getString(R.string.direccioRestaurant1),
                                        this.getResources().getString(R.string.direccioRestaurant2),
                                        this.getResources().getString(R.string.direccioRestaurant3)};
        telefon1 = (TextView) findViewById(R.id.telefon1);
        telefon2 = (TextView) findViewById(R.id.telefon2);
        telefon3 = (TextView) findViewById(R.id.telefon3);
        telefons = new TextView[]{telefon1,telefon2,telefon3};
        textTelefons = new String[]{  this.getResources().getString(R.string.telefonRestaurant1),
                this.getResources().getString(R.string.telefonRestaurant2),
                this.getResources().getString(R.string.telefonRestaurant3)};
        paginaWeb1 = (TextView) findViewById(R.id.url1);
        paginaWeb2 = (TextView) findViewById(R.id.url2);
        paginaWeb3 = (TextView) findViewById(R.id.url3);
        paginasWeb = new TextView[]{paginaWeb1,paginaWeb2,paginaWeb3};
        //iniciar web
        putLinesBelowDireccions();
        putLinesBelowPhones();
        putLinesBelowWeb();
        iniciarSpinner();
        restaruantImg = new String[]{
                "https://www.ahstatic.com/photos/6410_ho_00_p_1024x768.jpg",
                "https://app.pidepaya.com/wp-content/uploads/185658612_1929000710592237_2196111832220563407_n.jpg",
                "https://media-cdn.tripadvisor.com/media/photo-s/08/bb/5c/f5/italo-s-pizza.jpg"};
        carregarImgs();
        filterWithTheSpinner();
        direccio1.setOnClickListener(this);
        direccio2.setOnClickListener(this);
        direccio3.setOnClickListener(this);
        telefon1.setOnClickListener(this);
        telefon2.setOnClickListener(this);
        telefon3.setOnClickListener(this);
        paginaWeb1.setOnClickListener(this);
        paginaWeb2.setOnClickListener(this);
        paginaWeb3.setOnClickListener(this);
    }

    private void filterWithTheSpinner() {
        linearLayoutRestaurant1 = findViewById(R.id.restarunat1);
        linearLayoutRestaurant2 = findViewById(R.id.restarunat2);
        linearLayoutRestaurant3 = findViewById(R.id.restarunat3);
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
            if (selectedItem.equals(linearLayoutRestaurant1.getTag().toString())) {
                linearLayoutRestaurant1.setVisibility(View.VISIBLE);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayoutRestaurant1.getLayoutParams();
                layoutParams.height = 430;
                linearLayoutRestaurant1.setLayoutParams(layoutParams);
            }
            else{
                linearLayoutRestaurant1.setVisibility(View.INVISIBLE);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayoutRestaurant1.getLayoutParams();
                layoutParams.height = 0;
                linearLayoutRestaurant1.setLayoutParams(layoutParams);
            }
            if (selectedItem.equals(linearLayoutRestaurant2.getTag().toString())) {
                linearLayoutRestaurant2.setVisibility(View.VISIBLE);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayoutRestaurant2.getLayoutParams();
                layoutParams.height = 430;
                linearLayoutRestaurant2.setLayoutParams(layoutParams);
            }
            else{
                linearLayoutRestaurant2.setVisibility(View.INVISIBLE);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayoutRestaurant2.getLayoutParams();
                layoutParams.height = 0;
                linearLayoutRestaurant2.setLayoutParams(layoutParams);
            }
            if (selectedItem.equals(linearLayoutRestaurant3.getTag().toString())) {
                linearLayoutRestaurant3.setVisibility(View.VISIBLE);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayoutRestaurant3.getLayoutParams();
                layoutParams.height = 430;
                linearLayoutRestaurant3.setLayoutParams(layoutParams);
            }
            else{
                linearLayoutRestaurant3.setVisibility(View.INVISIBLE);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayoutRestaurant3.getLayoutParams();
                layoutParams.height = 0;
                linearLayoutRestaurant3.setLayoutParams(layoutParams);
            }
        }
        else{
            linearLayoutRestaurant1.setVisibility(View.VISIBLE);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayoutRestaurant1.getLayoutParams();
            layoutParams.height = 430;
            linearLayoutRestaurant1.setLayoutParams(layoutParams);
            linearLayoutRestaurant2.setVisibility(View.VISIBLE);
            layoutParams = (LinearLayout.LayoutParams) linearLayoutRestaurant2.getLayoutParams();
            layoutParams.height = 430;
            linearLayoutRestaurant2.setLayoutParams(layoutParams);
            linearLayoutRestaurant3.setVisibility(View.VISIBLE);
            layoutParams = (LinearLayout.LayoutParams) linearLayoutRestaurant3.getLayoutParams();
            layoutParams.height = 430;
            linearLayoutRestaurant3.setLayoutParams(layoutParams);
        }

    }


    private void putLinesBelowPhones() {
        for (int i = 0; i < telefons.length; i++) {
            lineaTelefon = new SpannableString(textTelefons[i]);
            lineaTelefon.setSpan(new UnderlineSpan(), 0, lineaTelefon.length(), 0);
            telefons[i].setText(lineaTelefon);
        }
    }

    private void putLinesBelowDireccions() {
        for (int i = 0; i < direccions.length; i++) {
            lineaDireccio = new SpannableString(textDireccions[i]);
            lineaDireccio.setSpan(new UnderlineSpan(), 0, lineaDireccio.length(), 0);
            direccions[i].setText(lineaDireccio);
        }
    }

    private void putLinesBelowWeb() {
        for (int i = 0; i < paginasWeb.length; i++) {
            lineaDireccio = new SpannableString("Pàgina web");
            lineaDireccio.setSpan(new UnderlineSpan(), 0, lineaDireccio.length(), 0);
            paginasWeb[i].setText(lineaDireccio);
        }
    }

    private void carregarImgs() {
        for (int i = 0; i < img.length; i++){
            Glide.with(this)
                    .load(restaruantImg[i])
                    .into(img[i]);
        }
    }

    private void iniciarSpinner() {
        String[] arraySpinner = new String[] {"No filter","Japones", "Italiano", "Mexicano"};
        s = (Spinner) findViewById(R.id.itemList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.direccio1)
        {
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + direccio1.getText().toString());
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }else if(view.getId() == R.id.direccio2)
        {
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + direccio2.getText().toString());
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }else if(view.getId() == R.id.direccio3)
        {
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + direccio3.getText().toString());
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        }else if(view.getId() == R.id.telefon1)
        {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", telefon1.getText().toString(), null));
            startActivity(intent);
        }else if(view.getId() == R.id.telefon2)
        {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", telefon2.getText().toString(), null));
            startActivity(intent);
        }
        else if(view.getId() == R.id.telefon3)
        {
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", telefon3.getText().toString(), null));
            startActivity(intent);
        }
        else if (view.getId() == R.id.url1)
        {
            String url = "https://www.facebook.com/people/L%C3%80nima-de-Granollers/100075909457722/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        else if (view.getId() == R.id.url2)
        {
            String url = "https://www.espaikodama.com/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        else if (view.getId() == R.id.url3)
        {
            String url = "https://www.tripadvisor.es/Restaurant_Review-g670666-d24130815-Reviews-Romabella_Granollers-Granollers_Catalonia.html";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
    }
}