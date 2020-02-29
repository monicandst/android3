package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Sinopsis extends AppCompatActivity {

    private TextView textJudul, textSinopsis;
    private ImageView Gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinopsis);

        String judul = getIntent().getStringExtra("judul");
        String sinopsis = getIntent().getStringExtra("sinopsis");
        int gambar = (getIntent().getIntExtra("gambar",0));//ini yang salah tadi

        textJudul = findViewById(R.id.textjudul);
        textSinopsis = findViewById(R.id.textsinopsis);
        Gambar = findViewById(R.id.imgsinopsis);

        textJudul.setText(judul);
        textSinopsis.setText(sinopsis);
        Glide.with(getApplicationContext()).load(gambar).into(Gambar);

    }
}
