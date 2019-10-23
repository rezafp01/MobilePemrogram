package com.example.viewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class FormDonasi extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_donasi);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Donasi Peswat R88");


        }
    }
}
