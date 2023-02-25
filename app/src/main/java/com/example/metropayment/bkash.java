package com.example.metropayment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class bkash extends AppCompatActivity {
    ImageButton homeimg, homebtn, qrscan, schedule, help, wallet,bkashpay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bkash);

        homeimg = (ImageButton) findViewById(R.id.homeimg);
        homebtn = (ImageButton) findViewById(R.id.homebtn);
        qrscan = (ImageButton) findViewById(R.id.qrscan);
        schedule = (ImageButton) findViewById(R.id.schedule);
        help = (ImageButton) findViewById(R.id.help);
        wallet = (ImageButton) findViewById(R.id.wallet);
        bkashpay = (ImageButton) findViewById(R.id.bkashpay);

        homeimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bkash.this, MainActivity.class);
                startActivity(intent);
            }
        });

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bkash.this, MainActivity.class);
                startActivity(intent);
            }
        });

        qrscan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bkash.this, qrscanner.class);
                startActivity(intent);
            }
        });

        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bkash.this, schedule.class);
                startActivity(intent);
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bkash.this, contacthelp.class);
                startActivity(intent);
            }
        });

        wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bkash.this, wallet.class);
                startActivity(intent);
            }
        });

        bkashpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(bkash.this, bkashpay.class);
                startActivity(intent);
            }
        });


    }
}