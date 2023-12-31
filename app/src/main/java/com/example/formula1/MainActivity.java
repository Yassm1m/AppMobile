package com.example.formula1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent nomeUsu = getIntent();
        String msg = "Entrou como: " + nomeUsu.getStringExtra(LoginActivity.LOGIN);
        TextView nomeText = (TextView)findViewById(R.id.txtEntrou);
        nomeText.setText(msg);
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
    public void toReciclagem(View v){
        Intent i = new Intent(this, ReciclagemActivity.class);
        startActivity(i);
    }
}