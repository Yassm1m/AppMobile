package com.example.formula1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toPistas(View v){
        Intent i = new Intent(this, PistaActivity.class);
        startActivity(i);
    }
    public void toDrivers(View v){
        Intent i = new Intent(this, CorredoresActivity.class);
        startActivity(i);
    }
    public void toMarcas(View v){
        Intent i = new Intent(this, MarcaActivity.class);
        startActivity(i);
    }

    public void toSobre(View v){
        Intent i = new Intent(this, SobreActivity.class);
        startActivity(i);
    }
}