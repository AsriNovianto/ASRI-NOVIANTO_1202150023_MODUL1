package com.example.android.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mMenu;
    private EditText mPorsi;
    //mMenu dan mPorsi itu digunakan untuk membuat method untuk EditText edit_menu dan edit_porsi

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMenu = (EditText) findViewById(R.id.edit_menu);
        mPorsi = (EditText) findViewById(R.id.edit_porsi);
    }

    public void eatbus(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        //pada langkah diatas digunakan untuk membuat intent pada SecondActivity

        String MenuMakanan = mMenu.getText().toString();
        String PorsiMakanan = mPorsi.getText().toString();
        //pada langkah diatas untuk membuat attribute

        intent.putExtra("Harga", "50000");
        intent.putExtra("Menu", MenuMakanan);
        intent.putExtra("Porsi", PorsiMakanan);
        intent.putExtra("Tempat", "Eatbus");

        startActivity(intent);
    }

    public void upnormal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        //pada langkah diatas digunakan untuk membuat intent pada SecondActivity

        String MenuMakanan = mMenu.getText().toString();
        String PorsiMakanan = mPorsi.getText().toString();
        //pada langkah diatas untuk membuat attribute

        intent.putExtra("Harga", "30000");
        intent.putExtra("Menu", MenuMakanan);
        intent.putExtra("Porsi", PorsiMakanan);
        intent.putExtra("Tempat", "Abnormal");

        startActivity(intent);
    }
}
