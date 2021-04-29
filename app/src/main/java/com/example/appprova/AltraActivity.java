package com.example.appprova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class AltraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altra);

        Log.d("prova", "chiamata on create l'altra");
        Intent i = getIntent();
        String valore = i.getStringExtra("KEY");
        Log.d("prova", "KEY= "+valore);
    }
}