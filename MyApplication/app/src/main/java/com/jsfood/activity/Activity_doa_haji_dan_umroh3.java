package com.jsfood.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.jsfood.DoaMasukKotaMadinah;
import com.jsfood.doa.DoaKetikaSampaiDiMudzalifah;
import com.jsfood.doa.DoaMasukMasjidilNabawi;
import com.jsfood.doa.DoaMelontarJumroh;
import com.jsfood.doa.DoaMemasukiKotaMekah;
import com.jsfood.model.R;

public class Activity_doa_haji_dan_umroh3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_doa_haji_dan_umroh3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(toolbar);

        Button btnDoaMasukMasjidilNabawi = (Button)findViewById(R.id.BtnDoaMasukMasjidilNabawi);
        Button btnMelontarJumrah = (Button)findViewById(R.id.BtnDoaMelontarJumrah);
        Button btnMasukKotaMadinah = (Button)findViewById(R.id.BtnDoaMasukKotaMadinah);
        Button btnMemasukiKotaMekah = (Button)findViewById(R.id.BtnDoaMemasukiKotaMekkah);
        Button btnLanjut = (Button)findViewById(R.id.BtnLanjut);



        btnDoaMasukMasjidilNabawi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh3.this, DoaMasukMasjidilNabawi.class);
                startActivity(intent);

            }
        });


        btnMelontarJumrah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh3.this, DoaMelontarJumroh.class);
                startActivity(intent);

            }
        });


        btnMasukKotaMadinah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh3.this, DoaMasukKotaMadinah.class);
                startActivity(intent);

            }
        });



        btnMemasukiKotaMekah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh3.this, DoaMemasukiKotaMekah.class);
                startActivity(intent);

            }
        });


        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh3.this, Activity_doa_haji_dan_umroh4.class);
                startActivity(intent);

            }
        });
    }

}
