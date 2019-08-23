package com.example.lenovo.konversiwaktu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{

    private Button b_hitung;
    private EditText kon_d;
    private TextView cetak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        kon_d = findViewById(R.id.hjam);

        b_hitung = findViewById(R.id.hitung);

        cetak = findViewById(R.id.cetak);

        b_hitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int rumus = 3600;
        if (v.getId() == R.id.hitung)
        {

            String inp_km = kon_d.getText().toString().trim();

            boolean tidakKosong = false;

            Integer hkm = toInt(inp_km);

            if (inp_km.length() < 0){

                kon_d.setError("Kolom ini harus di isi");

            }

            if (!tidakKosong)
            {
                int hasil = hkm * rumus;
                cetak.setText("Total\n"+String.valueOf(hasil));

            }
        }
    }

    private Integer toInt(String str) {
        try {
            return Integer.valueOf(str);
        }catch (Exception we){
            return null;
        }
    }
}
