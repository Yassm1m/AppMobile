package com.example.formula1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    public final static String LOGIN = "com.example.formula1.MESSAGE";
    EditText login, senha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (EditText) findViewById(R.id.edtLogin);
        senha = (EditText) findViewById(R.id.edtSenha);
    }

    public void enviarNome(View view) {
        if (login.getText().toString().matches("") || senha.getText().toString().matches("")) {
            Toast.makeText(this, "Por favor, preencha os dados acima", Toast.LENGTH_SHORT).show();
        } else {
            Intent home = new Intent(this, MainActivity.class);
            EditText nome = (EditText)findViewById(R.id.edtLogin);
            String msg = nome.getText().toString();
            home.putExtra(LOGIN, msg);
            startActivity(home);
        }
    }
}