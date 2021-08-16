package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    //Declaracion de los botones
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn_Reiniciar;

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

        comenzar();

        btn_Reiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comenzar();
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
        Toast.makeText(this, "Puedes comenzar", Toast.LENGTH_SHORT).show();
    }
}