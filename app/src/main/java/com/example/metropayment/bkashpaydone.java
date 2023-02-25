package com.example.metropayment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class bkashpaydone extends AppCompatActivity {
    ImageButton homeimg, homebtn, qrscan, schedule, help, wallet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bkashpaydone);

        homeimg = (ImageButton) findViewById(R.id.homeimg);
        homebtn = (ImageButton) findViewById(R.id.homebtn);
        qrscan = (ImageButton) findViewById(R.id.qrscan);
        schedule = (ImageButton) findViewById(R.id.schedule);
        help = (ImageButton) findViewById(R.id.help);
        wallet = (ImageButton) findViewById(R.id.wallet);

        homeimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bkashpaydone.this, MainActivity.class);
                startActivity(intent);
            }
        });

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bkashpaydone.this, MainActivity.class);
                startActivity(intent);
            }
        });

        qrscan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bkashpaydone.this, qrscanner.class);
                startActivity(intent);
            }
        });

        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bkashpaydone.this, schedule.class);
                startActivity(intent);
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bkashpaydone.this, contacthelp.class);
                startActivity(intent);
            }
        });

        wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bkashpaydone.this, wallet.class);
                startActivity(intent);
            }
        });

    }
}