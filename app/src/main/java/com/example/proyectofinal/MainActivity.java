package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Declaración de botones e objeto Intent
    Button btnIniciar;
    Intent navegar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Instanciación del botón
        btnIniciar = (Button)findViewById(R.id.btnIniciar);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Instanciación del objeto Intent
                navegar = new Intent(MainActivity.this, MainActivity2.class);
                //Detonación del Intent
                startActivity(navegar);
            }
        });
    }
}