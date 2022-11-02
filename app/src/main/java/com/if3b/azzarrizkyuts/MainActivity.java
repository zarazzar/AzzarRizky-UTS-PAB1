package com.if3b.azzarrizkyuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button btndaftar;
    EditText etNamaLenkap,etNomorPendaftaran;
    Spinner spJalurPendaftaran;
    CheckBox cbKonfirmasiDaftar;

    private  String nama,nomorpendaftar,jalurpendaftar,cbkonfirmasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        nama = etNamaLenkap.getText().toString();
        nomorpendaftar = etNomorPendaftaran.getText().toString();
        jalurpendaftar = spJalurPendaftaran.getSelectedItem().toString();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("FORMULIR PENDAFTARAN");

        etNamaLenkap = (EditText) findViewById(R.id.Et_NamaLengkap);
        etNomorPendaftaran = (EditText) findViewById(R.id.Et_nomorPendaftaran);
        btndaftar = findViewById(R.id.btn_daftar);
        cbKonfirmasiDaftar = findViewById(R.id.cb_KonfirmasiDafar);
        spJalurPendaftaran = findViewById(R.id.sp_jalurPendaftaran);



        Intent terima = getIntent();
        nama = terima.getStringExtra("kirimNama");
        nomorpendaftar = terima.getStringExtra("kirimNomor");
        jalurpendaftar = terima.getStringExtra("kirimJalur");



        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

    //        if (nama.trim().equals(""))
//        {
//         etNamaLenkap.setError("Nama Harus Di Isi!");
//        }
//        if(nomorpendaftar.trim().equals(""))
//        {
//            etNomorPendaftaran.setError("Nomor Pendaftar Harus Di ISi!");
//        }

            }
        });

    }
}