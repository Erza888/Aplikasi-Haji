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

public class PanduanHaji extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panduan_haji);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(toolbar);

        Button btnFungsiHaji = (Button)findViewById(R.id.BtnFungsiHaji);
        Button btnSyaratHaji = (Button)findViewById(R.id.BtnSyaratHaji);
        Button btnRukunHaji = (Button)findViewById(R.id.BtnRukunHaji);
        Button btnPelaksaanIbadahHaji = (Button)findViewById(R.id.BtnPelaksanaanIbadahHaji);



        btnFungsiHaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PanduanHaji.this, FungsiHaji.class);
                startActivity(intent);

            }
        });

        btnSyaratHaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PanduanHaji.this, SyaratHaji.class);
                startActivity(intent);

            }
        });

        btnRukunHaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PanduanHaji.this, RukunHaji.class);
                startActivity(intent);

            }
        });

        btnPelaksaanIbadahHaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PanduanHaji.this, Activity_Pelaksaan_Ibadah_Haji.class);
                startActivity(intent);

            }
        });
    }

}
