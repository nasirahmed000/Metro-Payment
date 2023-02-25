package com.example.metropayment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.DecodeCallback;
import com.google.zxing.Result;

public class destiqrscan extends AppCompatActivity {
    CodeScanner codscanner;
    CodeScannerView scannview;
    String resultData1, resultData2;
    ImageButton homeimg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destiqrscan);

        scannview = findViewById(R.id.scannerview);
        codscanner = new CodeScanner(this, scannview);
        homeimg = findViewById(R.id.homeimg);

        resultData1 = getIntent().getStringExtra("keydata");

        homeimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(destiqrscan.this, MainActivity.class);
                startActivity(intent);
            }
        });


        codscanner.setDecodeCallback(new DecodeCallback() {
            @Override
            public void onDecoded(@NonNull Result result) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        resultData2 = result.getText();
                        Toast.makeText(getApplicationContext(), "" + resultData2, Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(destiqrscan.this, paymentsuccess.class);
                        intent.putExtra("keydata2", resultData2);
                        intent.putExtra("keydata1", resultData1);
                        startActivity(intent);
                    }
                });
            }
        });

        scannview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                codscanner.startPreview();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        codscanner.startPreview();
    }
}