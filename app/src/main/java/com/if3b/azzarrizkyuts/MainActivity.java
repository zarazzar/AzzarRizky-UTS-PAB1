package com.if3b.azzarrizkyuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btndaftar;
    EditText etNamaLenkap,etNomorPendaftaran;
    Spinner spJalurPendaftaran;
    CheckBox cbKonfirmasiDaftar;

    private  String nama,nomorpendaftar,jalurpendaftar,cbkonfirmasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("FORMULIR PENDAFTARAN");

        etNamaLenkap = (EditText) findViewById(R.id.Et_NamaLengkap);
        etNomorPendaftaran = (EditText) findViewById(R.id.Et_nomorPendaftaran);
        btndaftar = findViewById(R.id.btn_daftar);
        spJalurPendaftaran = findViewById(R.id.sp_jalurPendaftaran);
        cbKonfirmasiDaftar = (CheckBox) findViewById(R.id.cb_KonfirmasiDafar);




        Intent terima = getIntent();
        nama = terima.getStringExtra("kirimNama");
        nomorpendaftar = terima.getStringExtra("kirimNomor");
        jalurpendaftar = terima.getStringExtra("kirimJalur");



        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Nama = etNamaLenkap.getText().toString();
                String Nomorpendaftar = etNomorPendaftaran.getText().toString();
                String Jalurpendaftar = spJalurPendaftaran.getSelectedItem().toString();

                if (Nama.trim().equals(""))
                {
                    etNamaLenkap.setError("Nama Harus Di Isi!");
                }
                else if (Nomorpendaftar.trim().equals(""))
                {
                    etNomorPendaftaran.setError("Nomor Pendaftaran Harus Di Isi!");
                }
                else if (jalurpendaftar.trim().equals("Jalur Pendaftaran"))
                {
                    Toast.makeText(MainActivity.this, "Pilih Jalur Pendaftaran Anda", Toast.LENGTH_SHORT).show();
                }
                else if(cbKonfirmasiDaftar.isChecked()==false)
                {
                    Toast.makeText(MainActivity.this, "Anda Belum mengKonfirmasi!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent pindah = new Intent(MainActivity.this, second_activity.class);
                    pindah.putExtra("kirimNama",Nama);
                    pindah.putExtra("kirimNomor",Nomorpendaftar);
                    pindah.putExtra("kirimJalur",Jalurpendaftar);

                    Toast.makeText(MainActivity.this, "Berhasil Daftar", Toast.LENGTH_SHORT).show();
                }

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