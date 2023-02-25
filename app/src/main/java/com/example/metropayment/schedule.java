package com.example.metropayment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class schedule extends AppCompatActivity {
    ImageButton homeimg, homebtn, qrscan,help,wallet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        homeimg = (ImageButton) findViewById(R.id.homeimg);
        homebtn = (ImageButton) findViewById(R.id.homebtn);
        qrscan = (ImageButton) findViewById(R.id.qrscan);
        help = (ImageButton) findViewById(R.id.help);
        wallet = (ImageButton) findViewById(R.id.wallet);

        homeimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(schedule.this, MainActivity.class);
                startActivity(intent);
            }
        });

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(schedule.this, MainActivity.class);
                startActivity(intent);
            }
        });

        qrscan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(schedule.this, qrscanner.class);
                startActivity(intent);
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(schedule.this, contacthelp.class);
                startActivity(intent);
            }
        });

        wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(schedule.this, wallet.class);
                startActivity(intent);
            }
        });

    }
}