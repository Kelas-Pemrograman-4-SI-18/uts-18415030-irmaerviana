package com.irma.uts_18415030_irmaerviana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        EditText edtnamaa, edtgolongan;
        Button btnhitung;
        TextView txtgajipokok, txttunjangan, txtgajibersih, txtpajak, txttampil1, txttampil2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            txttampil1 = findViewById(R.id.txtnama);
            txttampil2 = findViewById(R.id.txtgolong);

            edtnamaa = (EditText) findViewById(R.id.edtnama);
            edtgolongan = (EditText) findViewById(R.id.edtgolong);

            txtgajipokok = (TextView)findViewById(R.id.txtgajipokok);
            txttunjangan =(TextView)findViewById(R.id.txttunjangan);
            txtpajak = (TextView)findViewById(R.id.txtpajak);
            txtgajibersih = (TextView)findViewById(R.id.txtgajibersih);
            btnhitung = (Button) findViewById(R.id.btnhitung);

            btnhitung.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String namakaryawan, golongan;
            double gajipokok = 0, tunjangan = 0, pajak = 0, gajibersih;

            namakaryawan = edtnamaa.getText().toString();
            golongan = edtgolongan.getText().toString();

            if (golongan.equals("1")) {
                gajipokok = 1500000;
                tunjangan = 1000000;
                pajak = (gajipokok + tunjangan) * 0.01;
            } else if (golongan.equals("2")) {
                gajipokok = 2000000;
                tunjangan = 1500000;
                pajak = (gajipokok + tunjangan) * 0.02;
            } else if (golongan.equals("3")) {
                gajipokok = 2500000;
                tunjangan = 2000000;
                pajak = (gajipokok + tunjangan) * 0.03;
            } else if (golongan.equals("4")) {
                gajipokok = 3000000;
                tunjangan = 2500000;
                pajak = (gajipokok + tunjangan) * 0.04;
            }

            gajibersih = gajipokok + tunjangan - pajak;

            String strnama = edtnamaa.getText().toString();
            String strgolongan = edtgolongan.getText().toString();

            txttampil1.setText("Nama Karyawan :" + strnama);
            txttampil2.setText("Golongan :" + strgolongan);
            txtgajipokok.setText("Gaji Pokok :" + String.valueOf(gajipokok));
            txttunjangan.setText("Tunjangan:" + String.valueOf(tunjangan));
            txtpajak.setText("Pajak :" + String.valueOf(pajak));
            txtgajibersih.setText("Gaji Bersih :" + String.valueOf(gajibersih));
                }
            });
        }
}