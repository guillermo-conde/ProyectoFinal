package com.example.proyectofinal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    //Declaracion de los botones
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn_Reiniciar;
    TextView tvExito;

    //Declaracion de la matrizz
    String etiquetas[][] = new String[4][4];
    List<Integer> valores = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);//int valores[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Instanciación de los botones del juego
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn10 = (Button)findViewById(R.id.btn10);
        btn11 = (Button)findViewById(R.id.btn11);
        btn12 = (Button)findViewById(R.id.btn12);
        btn13 = (Button)findViewById(R.id.btn13);
        btn14 = (Button)findViewById(R.id.btn14);
        btn15 = (Button)findViewById(R.id.btn15);
        btn_Reiniciar = (Button)findViewById(R.id.btnReiniciar);

        tvExito = (TextView)findViewById(R.id.tv_exito);


        comenzar();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn0.getText();
                mover(numero);
                comprobarJuego();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn1.getText();
                mover(numero);
                comprobarJuego();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn2.getText();
                mover(numero);
                comprobarJuego();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn3.getText();
                mover(numero);
                comprobarJuego();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn4.getText();
                mover(numero);
                comprobarJuego();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn5.getText();
                mover(numero);
                comprobarJuego();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn6.getText();
                mover(numero);
                comprobarJuego();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn7.getText();
                mover(numero);
                comprobarJuego();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn8.getText();
                mover(numero);
                comprobarJuego();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn9.getText();
                mover(numero);
                comprobarJuego();
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn10.getText();
                mover(numero);
                comprobarJuego();
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn11.getText();
                mover(numero);
                comprobarJuego();
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn12.getText();
                mover(numero);
                comprobarJuego();
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn13.getText();
                mover(numero);
                comprobarJuego();
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn14.getText();
                mover(numero);
                comprobarJuego();
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn15.getText();
                mover(numero);
                comprobarJuego();
            }
        });

        btn_Reiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder confirmacion = new AlertDialog.Builder(MainActivity2.this);
                confirmacion.setTitle("Reiniciar Juego");
                confirmacion.setMessage("¿Seguro que desea reiniciar el juego?");
                confirmacion.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        comenzar();
                    }
                });
                confirmacion.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                confirmacion.show();
            }
        });
    }


    private void comenzar(){
        Collections.shuffle(valores);
        //Lenado de la matriz
        int cont = 0;
        for (int x = 0; x<4; x++){
            for (int y = 0; y<4; y++){
                if (x == 3 && y ==3){
                    etiquetas[x][y]="";
                }else{
                    etiquetas[x][y]= String.valueOf(valores.get(cont));
                    cont++;
                }
            }
        }
        llenarBotones();
        Toast.makeText(this, "Puedes comenzar", Toast.LENGTH_SHORT).show();
    }

    private void llenarBotones(){
        btn0.setText(etiquetas[0][0]);
        btn1.setText(etiquetas[0][1]);
        btn2.setText(etiquetas[0][2]);
        btn3.setText(etiquetas[0][3]);
        btn4.setText(etiquetas[1][0]);
        btn5.setText(etiquetas[1][1]);
        btn6.setText(etiquetas[1][2]);
        btn7.setText(etiquetas[1][3]);
        btn8.setText(etiquetas[2][0]);
        btn9.setText(etiquetas[2][1]);
        btn10.setText(etiquetas[2][2]);
        btn11.setText(etiquetas[2][3]);
        btn12.setText(etiquetas[3][0]);
        btn13.setText(etiquetas[3][1]);
        btn14.setText(etiquetas[3][2]);
        btn15.setText(etiquetas[3][3]);
        if (btn0.getText() == ""){
            btn0.setBackgroundColor(Color.GRAY);
        }else{
            btn0.setBackgroundColor(Color.WHITE);
        }
        if (btn1.getText() == ""){
            btn1.setBackgroundColor(Color.GRAY);
        }else{
            btn1.setBackgroundColor(Color.WHITE);
        }
        if (btn2.getText() == ""){
            btn2.setBackgroundColor(Color.GRAY);
        }else{
            btn2.setBackgroundColor(Color.WHITE);
        }
        if (btn3.getText() == ""){
            btn3.setBackgroundColor(Color.GRAY);
        }else{
            btn3.setBackgroundColor(Color.WHITE);
        }
        if (btn4.getText() == ""){
            btn4.setBackgroundColor(Color.GRAY);
        }else{
            btn4.setBackgroundColor(Color.WHITE);
        }
        if (btn5.getText() == ""){
            btn5.setBackgroundColor(Color.GRAY);
        }else{
            btn5.setBackgroundColor(Color.WHITE);
        }
        if (btn6.getText() == ""){
            btn6.setBackgroundColor(Color.GRAY);
        }else{
            btn6.setBackgroundColor(Color.WHITE);
        }
        if (btn7.getText() == ""){
            btn7.setBackgroundColor(Color.GRAY);
        }else{
            btn7.setBackgroundColor(Color.WHITE);
        }
        if (btn8.getText() == ""){
            btn8.setBackgroundColor(Color.GRAY);
        }else{
            btn8.setBackgroundColor(Color.WHITE);
        }
        if (btn9.getText() == ""){
            btn9.setBackgroundColor(Color.GRAY);
        }else{
            btn9.setBackgroundColor(Color.WHITE);
        }
        if (btn10.getText() == ""){
            btn10.setBackgroundColor(Color.GRAY);
        }else{
            btn10.setBackgroundColor(Color.WHITE);
        }
        if (btn11.getText() == ""){
            btn11.setBackgroundColor(Color.GRAY);
        }else{
            btn11.setBackgroundColor(Color.WHITE);
        }
        if (btn12.getText() == ""){
            btn12.setBackgroundColor(Color.GRAY);
        }else{
            btn12.setBackgroundColor(Color.WHITE);
        }
        if (btn13.getText() == ""){
            btn13.setBackgroundColor(Color.GRAY);
        }else{
            btn13.setBackgroundColor(Color.WHITE);
        }
        if (btn14.getText() == ""){
            btn14.setBackgroundColor(Color.GRAY);
        }else{
            btn14.setBackgroundColor(Color.WHITE);
        }
        if (btn15.getText() == ""){
            btn15.setBackgroundColor(Color.GRAY);
        }else{
            btn15.setBackgroundColor(Color.WHITE);
        }
    }

    private void mover(String etiqueta){
        int posX = 0, posY = 0;
        for (int x = 0; x<4; x++){
            for (int y = 0; y<4; y++){
                if (etiquetas[x][y] == etiqueta){
                    posX = x;
                    posY = y;
                    break;
                }
            }
        }

        switch (posX){
            case 0:
                if (posY == 0){
                    valDcha(posX, posY);
                    valAbajo(posX, posY);
                } else if (posY == 3){
                    valIzda(posX, posY);
                    valAbajo(posX, posY);
                }else{
                    valDcha(posX, posY);
                    valIzda(posX, posY);
                    valAbajo(posX, posY);
                }
                break;
            case 1:
                if (posY == 0){
                    valArriba(posX, posY);
                    valDcha(posX, posY);
                    valAbajo(posX, posY);
                } else if (posY == 3){
                    valArriba(posX, posY);
                    valIzda(posX, posY);
                    valAbajo(posX, posY);
                }else{
                    valArriba(posX, posY);
                    valDcha(posX, posY);
                    valIzda(posX, posY);
                    valAbajo(posX, posY);
                }
                break;
            case 2:
                if (posY == 0){
                    valArriba(posX, posY);
                    valDcha(posX, posY);
                    valAbajo(posX, posY);
                } else if (posY == 3){
                    valArriba(posX, posY);
                    valIzda(posX, posY);
                    valAbajo(posX, posY);
                }else{
                    valArriba(posX, posY);
                    valDcha(posX, posY);
                    valIzda(posX, posY);
                    valAbajo(posX, posY);
                }
                break;
            case 3:
                if (posY == 0){
                    valArriba(posX, posY);
                    valDcha(posX, posY);
                } else if (posY == 3){
                    valArriba(posX, posY);
                    valIzda(posX, posY);
                }else{
                    valArriba(posX, posY);
                    valDcha(posX, posY);
                    valIzda(posX, posY);
                }
                break;
        }

    }

    private void valArriba(int x, int y){
        String temporalEtiqueta;
        if (etiquetas[x-1][y] == ""){//¿Arriba esta vacío?
            temporalEtiqueta = etiquetas[x][y];
            etiquetas[x][y] = etiquetas[x-1][y];
            etiquetas[x-1][y] = temporalEtiqueta;
            llenarBotones();
        }
    }

    private void valDcha(int x, int y){
        String temporalEtiqueta;
        if (etiquetas[x][y+1] == ""){//¿A la derecha esta vacío?
            temporalEtiqueta = etiquetas[x][y];
            etiquetas[x][y] = etiquetas[x][y+1];
            etiquetas[x][y+1] = temporalEtiqueta;
            llenarBotones();
        }
    }

    private void valAbajo(int x, int y){
        String temporalEtiqueta;
        if (etiquetas[x+1][y] == ""){//¿Arriba esta vacío?
            temporalEtiqueta = etiquetas[x][y];
            etiquetas[x][y] = etiquetas[x+1][y];
            etiquetas[x+1][y] = temporalEtiqueta;
            llenarBotones();
        }
    }

    private void valIzda(int x, int y){
        String temporalEtiqueta;
        if (etiquetas[x][y-1] == ""){//¿Arriba esta vacío?
            temporalEtiqueta = etiquetas[x][y];
            etiquetas[x][y] = etiquetas[x][y-1];
            etiquetas[x][y-1] = temporalEtiqueta;
            llenarBotones();
        }
    }

    private void comprobarJuego(){
        int contAsc = 1;
        for (int x = 0; x<4; x++){
            for (int y = 1; y<4; y++){
                if (etiquetas[x][y] == String.valueOf(contAsc) && contAsc == 0){
                    tvExito.setText("¡Felicidades, has ganado! :D");
                }
            }
        }
    }


}