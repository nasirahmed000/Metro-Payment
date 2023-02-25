package com.example.metropayment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class wallet extends AppCompatActivity {
    ImageButton homeimg, homebtn, qrscan,schedule,help,bkash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);

        homeimg = (ImageButton) findViewById(R.id.homeimg);
        homebtn = (ImageButton) findViewById(R.id.homebtn);
        qrscan = (ImageButton) findViewById(R.id.qrscan);
        schedule = (ImageButton) findViewById(R.id.schedule);
        help = (ImageButton) findViewById(R.id.help);
        bkash = (ImageButton) findViewById(R.id.bkash);

        homeimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wallet.this, MainActivity.class);
                startActivity(intent);
            }
        });

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wallet.this, MainActivity.class);
                startActivity(intent);
            }
        });

        qrscan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wallet.this, qrscanner.class);
                startActivity(intent);
            }
        });

        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wallet.this, schedule.class);
                startActivity(intent);
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wallet.this, contacthelp.class);
                startActivity(intent);
            }
        });

        bkash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(wallet.this, bkash.class);
                startActivity(intent);
            }
        });
    }
}