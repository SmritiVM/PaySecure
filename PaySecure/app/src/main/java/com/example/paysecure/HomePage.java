package com.example.paysecure;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

//Get the bundle

public class HomePage extends AppCompatActivity {

    TextView amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Bundle bundle = getIntent().getExtras();

        //Extract the data…
        String final_amt = bundle.getString("final_amt");
        amount = findViewById(R.id.amountView);
        amount.setText(final_amt);


    }
}