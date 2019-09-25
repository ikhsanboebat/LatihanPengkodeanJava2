package com.example.latihanpengkodeanjava2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class intent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
    }

    public void Intent1(View view){
        Intent i = new Intent(intent.this,MainActivity.class);
        startActivity(i);
    }

    public void Intent2(View view){
        Intent i = new Intent(intent.this,LATIHAN2.class);
        startActivity(i);
    }
}
