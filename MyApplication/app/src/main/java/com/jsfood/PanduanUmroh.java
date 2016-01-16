package com.jsfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.jsfood.model.R;

public class PanduanUmroh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panduan_umroh);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(toolbar);


        Button btnFungsiUmroh = (Button)findViewById(R.id.BtnFungsiUmroh);
        Button btnSyaratUmroh = (Button)findViewById(R.id.BtnSyaratUmroh);
        Button btnRukunUmroh = (Button)findViewById(R.id.BtnRukunUmroh);
        Button btnPelaksaanIbadahUmroh = (Button)findViewById(R.id.BtnPelaksaanIbadahUmroh);



        btnFungsiUmroh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PanduanUmroh.this, Fungsi_Umroh.class);
                startActivity(intent);

            }
        });

        btnSyaratUmroh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PanduanUmroh.this, SyaratUmroh.class);
                startActivity(intent);

            }
        });

        btnRukunUmroh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PanduanUmroh.this, RukunUmroh.class);
                startActivity(intent);

            }
        });

        btnPelaksaanIbadahUmroh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PanduanUmroh.this, Activity_Pelaksanaan_Ibadah_Umroh.class);
                startActivity(intent);

            }
        });
    }

}
