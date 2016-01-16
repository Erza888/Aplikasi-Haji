package com.jsfood.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.jsfood.doa.DoaIhram;
import com.jsfood.doa.DoaKetikaSampaiDiMudzalifah;
import com.jsfood.doa.DoaKetikaTibaDiTempatTujuanMekah;
import com.jsfood.doa.DoaMasukArafah;
import com.jsfood.doa.DoaMasukMasjidilHaram;
import com.jsfood.model.R;

public class Activity_doa_haji_dan_umroh2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_doa_haji_dan_umroh2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(toolbar);

        Button btnKetikaSampaiDiMuzdalifah = (Button)findViewById(R.id.BtnDoaKetikaSampaiDiMuzdalifah);
        Button btnKetikaTibaDitempat = (Button)findViewById(R.id.BtnDoaKetikaTibaDiTempatTujuanMekkah);
        Button btnMasukArafah = (Button)findViewById(R.id.BtnDoaMasukArafah);
        Button btnMasukMasjidilHaram = (Button)findViewById(R.id.BtnDoaMasukMasjidilHaram);
        Button btnLanjut = (Button)findViewById(R.id.BtnLanjut);




        btnKetikaSampaiDiMuzdalifah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh2.this, DoaKetikaSampaiDiMudzalifah.class);
                startActivity(intent);

            }
        });

        btnKetikaTibaDitempat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh2.this, DoaKetikaTibaDiTempatTujuanMekah.class);
                startActivity(intent);

            }
        });

        btnMasukArafah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh2.this, DoaMasukArafah.class);
                startActivity(intent);

            }
        });

        btnMasukMasjidilHaram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh2.this, DoaMasukMasjidilHaram.class);
                startActivity(intent);

            }
        });

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh2.this, Activity_doa_haji_dan_umroh3.class);
                startActivity(intent);

            }
        });

    }

}
