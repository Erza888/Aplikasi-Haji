package com.jsfood.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.jsfood.DoaMengguntingRambut;
import com.jsfood.doa.DoaMasukMasjidilNabawi;
import com.jsfood.doa.DoaSai;
import com.jsfood.doa.DoaSampaiDiTanahAir;
import com.jsfood.doa.DoaSelesaiMelaksanakanUmroh;
import com.jsfood.model.R;

public class Activity_doa_haji_dan_umroh4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_doa_haji_dan_umroh4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(toolbar);

        Button btnDoaMengguntingRambut = (Button)findViewById(R.id.BtnDoaMengguntingRambut);
        Button btnSai = (Button)findViewById(R.id.BtnDoaSai);
        Button btnSampaiTanahAir = (Button)findViewById(R.id.BtnDoaSampaiDiTanahAir);
        Button btnSelesaiHaji = (Button)findViewById(R.id.BtnSelesaiMelaksanakanHajiDanUmroh);
        Button btnLanjut = (Button)findViewById(R.id.BtnLanjut);

        btnDoaMengguntingRambut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh4.this, DoaMengguntingRambut.class);
                startActivity(intent);

            }
        });


        btnSai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh4.this, DoaSai.class);
                startActivity(intent);

            }
        });

        btnSampaiTanahAir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh4.this, DoaSampaiDiTanahAir.class);
                startActivity(intent);

            }
        });

        btnSelesaiHaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh4.this, DoaSelesaiMelaksanakanUmroh.class);
                startActivity(intent);

            }
        });

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh4.this, Activity_doa_haji_dan_umroh5.class);
                startActivity(intent);

            }
        });

    }

}
