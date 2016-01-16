package com.jsfood.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.jsfood.DoaDiatasKendaraan;
import com.jsfood.doa.DoaSai;
import com.jsfood.doa.DoaSewaktuKendaraanBergerak;
import com.jsfood.doa.DoaThawaf;
import com.jsfood.doa.DoaWukuf;
import com.jsfood.model.R;

public class Activity_doa_haji_dan_umroh5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_doa_haji_dan_umroh5);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(toolbar);

        Button btnSewaktuKendaraanBergerak = (Button)findViewById(R.id.BtnDoaSewaktuKendaraanBergerak);
        Button btnThawaf = (Button)findViewById(R.id.BtnDoaThawaf);
        Button BtnWaktuDiatasKendaraan = (Button)findViewById(R.id.BtnDoaWaktuDiAtasKendaraan);
        Button btnWukuf = (Button)findViewById(R.id.BtnDoaWukuf);
        Button btnLanjut = (Button)findViewById(R.id.BtnLanjut);


        btnSewaktuKendaraanBergerak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh5.this, DoaSewaktuKendaraanBergerak.class);
                startActivity(intent);

            }
        });


        btnThawaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh5.this, DoaThawaf.class);
                startActivity(intent);

            }
        });


        BtnWaktuDiatasKendaraan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh5.this, DoaDiatasKendaraan.class);
                startActivity(intent);

            }
        });


        btnWukuf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh5.this, DoaWukuf.class);
                startActivity(intent);

            }
        });


        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh5.this, Activity_doa_haji_dan_umroh6.class);
                startActivity(intent);

            }
        });

    }

}
