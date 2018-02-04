package com.example.android.studycase1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String lihatMenu = intent.getStringExtra("Menu");
        String lihatPorsi = intent.getStringExtra("Porsi");
        String namaTempat = intent.getStringExtra("Tempat");
        String hargaMakanan = intent.getStringExtra("Harga");
        //pada langkah diatas digunakan untuk membuat intent

        int total_harga = Integer.valueOf(lihatPorsi)*Integer.valueOf(hargaMakanan);

        TextView Menu = (TextView) findViewById(R.id.menuMakan);
        TextView Porsi = (TextView)findViewById(R.id.porsiMakan);
        TextView Tempat = (TextView) findViewById(R.id.tempatMakan);
        TextView Harga = (TextView) findViewById(R.id.hargaTotal);

        Menu.setText(lihatMenu);
        Porsi.setText(lihatPorsi);
        Tempat.setText(namaTempat);
        Harga.setText(String.valueOf(total_harga));

        if (total_harga > 65500) {
            Toast toast = Toast.makeText(this, "Uang anda kurang untuk makan disini", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Uang anda cukup untuk makan disini", Toast.LENGTH_LONG);
            toast.show();
        }
        //pada langkah diatas digunakan untuk mengatur tentang harga makanan,yang sesuai untuk 2 orang.
    }
}
