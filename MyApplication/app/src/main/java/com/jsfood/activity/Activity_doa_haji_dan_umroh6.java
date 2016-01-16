package com.jsfood.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.jsfood.doa.DoaINiatIbadahHajiDanUmroh;
import com.jsfood.doa.DoaSewaktuKendaraanBergerak;
import com.jsfood.model.R;

public class Activity_doa_haji_dan_umroh6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_doa_haji_dan_umroh6);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(toolbar);


        Button BtnDoaNiatIbadahHajiDanUmroh = (Button)findViewById(R.id.BtnDoaNiatIbadahHajiDanUmroh);

        BtnDoaNiatIbadahHajiDanUmroh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_doa_haji_dan_umroh6.this, DoaINiatIbadahHajiDanUmroh.class);
                startActivity(intent);

            }
        });


    }

}
