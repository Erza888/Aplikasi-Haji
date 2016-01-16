package com.jsfood.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


import com.jsfood.MainActivity;
import com.jsfood.PanduanHaji;
import com.jsfood.doa.DoaIhram;
import com.jsfood.doa.DoaKeluarRumah;
import com.jsfood.doa.DoaKetikaMelihatKabah;
import com.jsfood.doa.DoaKetikaSampaiDiMina;
import com.jsfood.model.R;

public class Activity_doa_haji_dan_umroh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_doa_haji_dan_umroh);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(toolbar);

        Button btnIhram = (Button)findViewById(R.id.BtnDoaIhram);
        Button btnKeluarRumahBerangkatHaji = (Button)findViewById(R.id.BtnDoaKeluarRumah);
        Button btnKetikaSampaiDiMina = (Button)findViewById(R.id.BtnDoaKetikaSampaiDiMina);
        Button btnKetikaMelihatKabah = (Button)findViewById(R.id.BtnDoaKetikaMelihatKabah);
        Button btnLanjut = (Button)findViewById(R.id.BtnLanjut);


        btnIhram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh.this, DoaIhram.class);
                startActivity(intent);

            }
        });

        btnKeluarRumahBerangkatHaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh.this, DoaKeluarRumah.class);
                startActivity(intent);

            }
        });

        btnKetikaSampaiDiMina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh.this, DoaKetikaSampaiDiMina.class);
                startActivity(intent);

            }
        });

        btnKetikaMelihatKabah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh.this, DoaKetikaMelihatKabah.class);
                startActivity(intent);

            }
        });

        btnLanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh.this, Activity_doa_haji_dan_umroh2.class);
                startActivity(intent);

            }
        });


    }

}
