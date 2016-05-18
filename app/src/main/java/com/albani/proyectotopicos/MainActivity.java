package com.albani.proyectotopicos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void abrirAcercaDe(View view){
        Intent intent = new Intent(this, AcercaDe.class);
        startActivity(intent);
    }

    public void abrirCercanos(View view){
        Intent intent = new Intent(this, MasCercanos.class);
        startActivity(intent);
    }
}
