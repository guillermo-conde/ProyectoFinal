package com.example.proyectofinal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    //Declaracion de los botones
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn_Reiniciar;
    TextView tvExito;

    //Declaracion de la matrizz
    String etiquetas[][] = new String[4][4];

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
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn1.getText();
                mover(numero);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn2.getText();
                mover(numero);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn3.getText();
                mover(numero);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn4.getText();
                mover(numero);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn5.getText();
                mover(numero);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn6.getText();
                mover(numero);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn7.getText();
                mover(numero);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn8.getText();
                mover(numero);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn9.getText();
                mover(numero);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn10.getText();
                mover(numero);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn11.getText();
                mover(numero);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn12.getText();
                mover(numero);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn13.getText();
                mover(numero);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn14.getText();
                mover(numero);
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn15.getText();
                mover(numero);
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
        //Lenado de la matriz
        int cont = 1;
        for (int x = 0; x<4; x++){
            for (int y = 0; y<4; y++){
                if (x == 3 && y ==3){
                    etiquetas[x][y]="";
                }else{
                    etiquetas[x][y]= String.valueOf(cont);
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
        int contDesc = 15;
        for (int x = 0; x<4; x++){
            for (int y = 1; y<4; y++){
                if (etiquetas[x][y] == String.valueOf(contDesc) && contDesc == 0){
                    tvExito.setText("¡Felicidades, has ganado! :D");
                }
            }
        }
    }
}