package com.example.viewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnDonasi;
    Button btnKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDonasi = findViewById(R.id.btnDonasi);
        btnDonasi.setOnClickListener(this);



        if(getSupportActionBar() !=null){
            getSupportActionBar().setTitle("Donasi Peswat R88");
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnDonasi:
                Intent Donasi = new Intent(this, FormDonasi.class);
                startActivity(Donasi);
                break;

        }

    }

}
