package com.example.metropayment;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class manualDesti extends AppCompatActivity {
    ListView listFont;
    ImageButton homeimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_desti);

        listFont = (ListView) findViewById(R.id.listFont);
        String[] values = new String[]{"Mirpur 12", "Mirpur 11", "Mirpur 10", "Mirpur 1", "Mirpur 2"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, values);
        listFont.setAdapter(adapter);

        listFont.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemValue = (String) listFont.getItemAtPosition(position);

                if (itemValue.equals("Mirpur 12")) {
                    Intent intent = new Intent(manualDesti.this, sourceDesti.class);
                    startActivity(intent);
                }

                if (itemValue.equals("Mirpur 11")) {
                    Intent intent = new Intent(manualDesti.this, sourceDesti.class);
                    startActivity(intent);
                }

                if (itemValue.equals("Mirpur 10")) {
                    Intent intent = new Intent(manualDesti.this, sourceDesti.class);
                    startActivity(intent);
                }

                if (itemValue.equals("Mirpur 1")) {
                    Intent intent = new Intent(manualDesti.this, sourceDesti.class);
                    startActivity(intent);
                }

                if (itemValue.equals("Mirpur 2")) {
                    Intent intent = new Intent(manualDesti.this, sourceDesti.class);
                    startActivity(intent);
                }
            }
        });

        homeimg = (ImageButton) findViewById(R.id.homeimg);
        homeimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(manualDesti.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}