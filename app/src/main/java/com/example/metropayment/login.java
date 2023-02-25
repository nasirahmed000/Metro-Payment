package com.example.metropayment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText etusername, etuserpass;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        String uname = "admin", upass = "123";

        etusername = findViewById(R.id.etusername);
        etuserpass = findViewById(R.id.etuserpass);
        btnlogin = findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textN = etusername.getText().toString(); //converting username into string
                String textP = etuserpass.getText().toString(); //converting password into string
                if ((textN.equals(uname)) && (textP.equals(upass))) {
                    Toast.makeText(getApplicationContext(), "Login Successful!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(login.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Input Incorrect!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}