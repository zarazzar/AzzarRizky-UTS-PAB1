package com.if3b.azzarrizkyuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        getSupportActionBar().setTitle("KONFIRMASI PENDAFTARAN");
    }
}