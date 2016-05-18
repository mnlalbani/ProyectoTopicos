package com.albani.proyectotopicos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MasCercanos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mas_cercanos);
    }

    protected void Colmao(View view){
        Intent intent = new Intent(this, MapsActivityCercanos.class);
        intent.putExtra("Restaurante", "Colmao");
        startActivity(intent);
    }
    protected void Rosita(View view){
        Intent intent = new Intent(this, MapsActivityCercanos.class);
        intent.putExtra("Restaurante", "Rosita");
        startActivity(intent);
    }
    protected void Jardin(View view){
        Intent intent = new Intent(this, MapsActivityCercanos.class);
        intent.putExtra("Restaurante", "Jardin");
        startActivity(intent);
    }
    protected void Maxi(View view){
        Intent intent = new Intent(this, MapsActivityCercanos.class);
        intent.putExtra("Restaurante", "Maxi");
        startActivity(intent);
    }
    protected void Donald(View view){
        Intent intent = new Intent(this, MapsActivityCercanos.class);
        intent.putExtra("Restaurante", "Donald");
        startActivity(intent);
    }
    protected void Salim(View view){
        Intent intent = new Intent(this, MapsActivityCercanos.class);
        intent.putExtra("Restaurante", "Salim");
        startActivity(intent);
    }
    protected void Ravioli(View view){
        Intent intent = new Intent(this, MapsActivityCercanos.class);
        intent.putExtra("Restaurante", "Ravioli");
        startActivity(intent);
    }
    protected void Rika(View view){
        Intent intent = new Intent(this, MapsActivityCercanos.class);
        intent.putExtra("Restaurante", "Rika");
        startActivity(intent);
    }
}
