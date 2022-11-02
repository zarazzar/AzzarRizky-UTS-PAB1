package com.if3b.azzarrizkyuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class second_activity extends AppCompatActivity {
    TextView tvNama,tvNomor,tvJalurPendaftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        getSupportActionBar().setTitle("KONFIRMASI PENDAFTARAN");

        tvNama = findViewById(R.id.TV_nama);
        tvNomor = findViewById(R.id.TV_nomorPendaftaran);
        tvJalurPendaftar = findViewById(R.id.TV_jalurPendaftaran);

        Intent terima = getIntent();
        String ynama = terima.getStringExtra("kirimNama");
        String ypendaftar = terima.getStringExtra("kirimNomor");
        String yjalur = terima.getStringExtra("kirimJalur");

        tvNama.setText(ynama);
        tvNomor.setText(ypendaftar);
        tvJalurPendaftar.setText(yjalur);
    }
}