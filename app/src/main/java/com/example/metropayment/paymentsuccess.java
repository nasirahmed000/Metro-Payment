package com.example.metropayment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class paymentsuccess extends AppCompatActivity {
    TextView journeycost;
    ImageButton homeimg, homebtn, qrscan, schedule, help, wallet;
    Button closebtn;
    int cost = 0;
    String resultData1, resultData2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentsuccess);
        journeycost = (TextView) findViewById(R.id.journeycost);
        homeimg = (ImageButton) findViewById(R.id.homeimg);
        homebtn = (ImageButton) findViewById(R.id.homebtn);
        qrscan = (ImageButton) findViewById(R.id.qrscan);
        closebtn = (Button) findViewById(R.id.closebtn);
        schedule = (ImageButton) findViewById(R.id.schedule);
        help = (ImageButton) findViewById(R.id.help);
        wallet = (ImageButton) findViewById(R.id.wallet);

        resultData1 = getIntent().getStringExtra("keydata1");
        resultData2 = getIntent().getStringExtra("keydata2");

        if (resultData1.equals("Mirpur 10") && resultData2.equals("Mirpur 12") || resultData2.equals("Mirpur 12") && resultData1.equals("Mirpur 10")) {
            cost = 20;
            journeycost.setText("Journey cost: 20 Taka");
        } else if (resultData1.equals("Mirpur 10") && resultData2.equals("Mirpur 12") || resultData1.equals("Mirpur 1") && resultData2 .equals("Mirpur 10")) {
            cost = 30;
            journeycost.setText("Journey cost: 30 Taka");
        } else if (resultData1.equals("Mirpur 12") && resultData2.equals("Mirpur 1") || resultData1.equals("Mirpur 1") && resultData2 .equals("Mirpur 12")) {
            cost = 40;
            journeycost.setText("Journey cost: 40 Taka");
        } else if (resultData1.equals("Mirpur 10") && resultData2.equals("Mirpur 10") || resultData1.equals("Mirpur 12") && resultData2.equals("Mirpur 12") || resultData1.equals("Mirpur 1") && resultData2.equals("Mirpur 1")) {
            cost = 0;
            journeycost.setText("Journey cost: 0 Taka");
        }

        homeimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(paymentsuccess.this, MainActivity.class);
                startActivity(intent);
            }
        });

        closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(paymentsuccess.this, MainActivity.class);
                startActivity(intent);
            }
        });

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(paymentsuccess.this, MainActivity.class);
                startActivity(intent);
            }
        });

        qrscan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(paymentsuccess.this, qrscanner.class);
                startActivity(intent);
            }
        });

        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(paymentsuccess.this, schedule.class);
                startActivity(intent);
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(paymentsuccess.this, contacthelp.class);
                startActivity(intent);
            }
        });

        wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(paymentsuccess.this, wallet.class);
                startActivity(intent);
            }
        });
    }
}