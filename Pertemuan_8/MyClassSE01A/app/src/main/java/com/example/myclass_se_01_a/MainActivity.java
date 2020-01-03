package com.example.myclass_se_01_a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button LihatData ;
    Button InputData ;
    Button Informasi ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LihatData = findViewById(R.id.lihatbtn);
        InputData = findViewById(R.id.inputbtn);
        Informasi = findViewById(R.id.infobtn);

       LihatData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, DataMahasiswa.class);
                startActivity(intent);
            }
        });

        InputData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this,InputData.class);
                startActivity(intent);
            }
        });

        Informasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this,Informasi.class);
                startActivity(intent);
            }
        });
    }
}
