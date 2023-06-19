package com.example.paysecure;

import android.content.Intent;
import android.view.View;

import android.widget.Button;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Transfer extends AppCompatActivity {

    Button submit;
    EditText amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);
        submit = findViewById((R.id.notif));
        amount = findViewById(R.id.amount);
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(Transfer.this, GPSTrack.class);
                startActivity(i);
            }
        });

    }
}