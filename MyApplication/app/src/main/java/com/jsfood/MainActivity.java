package com.jsfood;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import com.jsfood.activity.Activity_doa_haji_dan_umroh;
import com.jsfood.model.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(toolbar);

        Button btnPanduanHaji = (Button)findViewById(R.id.BtnPanduanHaji);
        Button btnPanduanUmroh = (Button)findViewById(R.id.BtnPanduanUmroh);
        Button btnDoaHajiDanUmroh = (Button)findViewById(R.id.BtnHajiDanUmroh);
        Button btnAbout = (Button)findViewById(R.id.BtnAbout);
        Button btnexit = (Button)findViewById(R.id.BtnExit);


        btnPanduanHaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PanduanHaji.class);
                startActivity(intent);

            }
        });

        btnPanduanUmroh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PanduanUmroh.class);
                startActivity(intent);

            }
        });

        btnDoaHajiDanUmroh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity_doa_haji_dan_umroh.class);
                startActivity(intent);

            }
        });

        /////////////// about belum diisi

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);

            }
        });


        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);

            }
        });






    }

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Apa kalian ingin Exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        moveTaskToBack(true);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
