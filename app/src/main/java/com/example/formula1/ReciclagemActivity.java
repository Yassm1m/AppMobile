package com.example.formula1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ReciclagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciclagem);
    }

    public void noticiaUm(View v){
        Uri n = Uri.parse("http://www.grandepremio.com.br/f1/noticias/ford-promete-compromisso-sustentabilidade-parceria-red-bull-f1/");
        Intent i = new Intent(Intent.ACTION_VIEW, n);
        startActivity(i);
    }
    public void noticiaDois(View v){
        Uri n = Uri.parse("http://impakter.com/sustainability-and-f1-strive-to-survive/");
        Intent i = new Intent(Intent.ACTION_VIEW, n);
        startActivity(i);
    }
    public void noticiaTres(View v){
        Uri n = Uri.parse("http://singaporegp.sg/en/sustainability");
        Intent i = new Intent(Intent.ACTION_VIEW, n);
        startActivity(i);
    }
    public void noticiaQuatro(View v){
        Uri n = Uri.parse("http://ge.globo.com/motor/formula-1/noticia/2023/02/28/com-metas-sustentaveis-f1-esbarra-na-logistica-do-calendario.ghtml");
        Intent i = new Intent(Intent.ACTION_VIEW, n);
        startActivity(i);
    }
    public void noticiaCinco(View v){
        Uri n = Uri.parse("http://www.greenmatters.com/climate-action/is-f1-bad-for-the-environment");
        Intent i = new Intent(Intent.ACTION_VIEW, n);
        startActivity(i);
    }
}