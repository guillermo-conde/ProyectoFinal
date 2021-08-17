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
    //Declaración del TExtView para el mensaje de victoria
    TextView tvExito;
    //Bandera auxiliar para mostrar u ocultar el mensaje de victoria
    boolean bandera = false;
    //Declaracion de la matriz
    String etiquetas[][] = new String[4][4];
    //Se crea una matriz para mas adelante usar "shuffle" y desordenar los números
    List<Integer> valores = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

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
        //Instanciacion del Textview.
        tvExito = (TextView)findViewById(R.id.tv_exito);

        //Funcion que inicializa a los botones.
        comenzar();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero = (String) btn0.getText();//Obtenemos la etiqueta del botón
                mover(numero);//Mandamos a llamar a la funcion mover y le pasamos el valor de la etiqueta.
                comprobarJuego();//Comprobamos si con este mocimiento el juego ha concluido
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
                AlertDialog.Builder confirmacion = new AlertDialog.Builder(MainActivity2.this);//Instanciación de un cuadro de dialogo para confirmar si desea reiniciar el juego.
                confirmacion.setTitle("Reiniciar Juego");//Titulo del cuadro de diálogo
                confirmacion.setMessage("¿Seguro que desea reiniciar el juego?");//MEnsaje del cuadro de diálogo
                confirmacion.setPositiveButton("Sí", new DialogInterface.OnClickListener() {//Colocamos un botón afirmativo
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        comenzar();//Cuando se presione el botón afirmativo se manda a llamar la función comenzar para reiniciar el juego
                    }
                });
                confirmacion.setNegativeButton("No", new DialogInterface.OnClickListener() {//Colocamos un botón negativo
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }//Al presionarse el botón negativo, simplemente se cierra el cuadro de diálogo
                });
                confirmacion.show(); //Mostramos el cuadro de diálogo
            }
        });
    }


    private void comenzar(){
        Collections.shuffle(valores);//Desordenamos la lista con los valores de las etiquetas aleatoriamente.
        //Lenado de la matriz
        int cont = 0;
        for (int x = 0; x<4; x++){
            for (int y = 0; y<4; y++){
                if (x == 3 && y ==3){//Si nos encontramos en el último botón
                    etiquetas[x][y]="";//Se llena con un espacio vacío.
                }else{
                    etiquetas[x][y]= String.valueOf(valores.get(cont));//Se llena la posición de la matriz en base al índice de la lista de valores
                    cont++;
                }
            }
        }
        bandera = false;//La bandera se inicializa en falso, últil cuando se desea reiniciar el juego
        comprobarJuego();//Comprobamos el juego para desaparecer el mensaje de victoria, en caso de que se haya ganado el juego previo
        llenarBotones();//Invocación de la función para colocar etiquetas a los botones
        Toast.makeText(this, "Puedes comenzar", Toast.LENGTH_SHORT).show();//Indicamos al usuario que puede comenzazr a jugar
    }

    private void llenarBotones(){
        //Asignamos los valores como etiquetas de cada botón
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

        //Condicionales para cambiar el color de blanco a gris cuando la etiqueta del botón esté vacía.
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

        //Condicionales para validar que los botones tengan las etiquetas ordenadas correctamente para ganar, se cambia el estado de la bandera entre true o false.
        if (btn0.getText().equals("1")){
            bandera = true;
            if (btn2.getText().equals("3")){
                bandera = true;
                if (btn3.getText().equals("4")){
                    bandera = true;
                    if (btn4.getText().equals("5")){
                        bandera = true;
                        if (btn5.getText().equals("6")){
                            bandera = true;
                            if (btn6.getText().equals("7")){
                                bandera = true;
                                if (btn7.getText().equals("8")){
                                    bandera = true;
                                    if (btn8.getText().equals("9")){
                                        bandera = true;
                                        if (btn9.getText().equals("10")){
                                            bandera = true;
                                            if (btn10.getText().equals("11")){
                                                bandera = true;
                                                if (btn11.getText().equals("12")){
                                                    bandera = true;
                                                    if (btn12.getText().equals("13")){
                                                        bandera = true;
                                                        if (btn13.getText().equals("14")){
                                                            bandera = true;
                                                            if (btn14.getText().equals("15")){
                                                                bandera = true;
                                                            }else{
                                                                bandera = false;
                                                            }
                                                        }else{
                                                            bandera = false;
                                                        }
                                                    }else{
                                                        bandera = false;
                                                    }
                                                }else{
                                                    bandera = false;
                                                }
                                            }else{
                                                bandera = false;
                                            }
                                        }else{
                                            bandera = false;
                                        }
                                    }else{
                                        bandera = false;
                                    }
                                }else{
                                    bandera = false;
                                }
                            }else{
                                bandera = false;
                            }
                        }else{
                            bandera = false;
                        }
                    }else{
                        bandera = false;
                    }
                }else{
                    bandera = false;
                }
            }else{
                bandera = false;
            }
        }else{
            bandera = false;

        }
    }

    private void mover(String etiqueta){//Se recibe como parámetro la etiqueta actual del botón
        int posX = 0, posY = 0; //Se declaran las variables para almacenar los indices.
        //Recorrido de la matriz
        for (int x = 0; x<4; x++){
            for (int y = 0; y<4; y++){
                if (etiquetas[x][y] == etiqueta){//Si se encuentra coincidencia entre la etiqueta del botón y el elemento de la matriz
                    //Se almacenan los índices de su ubicación
                    posX = x;
                    posY = y;
                    break;
                }
            }
        }

        /*En esta sección del código, se validan los movimientos posibles (mas no los permitidos, por ejemplo cuando el botón presionado se encuentra en la fila
        superior, no es posible moverlo hacia arriba)*/
        switch (posX){//En función de la posición en el eje X
            case 0://Si se encuentra en la fila superior
                if (posY == 0){//Si está en la esquina izquierda
                    valDcha(posX, posY);
                    valAbajo(posX, posY);
                } else if (posY == 3){//Si está en la esquina derecha
                    valIzda(posX, posY);
                    valAbajo(posX, posY);
                }else{//Si está en la posiciones centrales
                    valDcha(posX, posY);
                    valIzda(posX, posY);
                    valAbajo(posX, posY);
                }
                break;
            case 1://Si se encuentra en la fila debajo de la superior (central)
            case 2:
                if (posY == 0){//Si está en el borde izquierdo
                    valArriba(posX, posY);
                    valDcha(posX, posY);
                    valAbajo(posX, posY);
                } else if (posY == 3){//Si está en el borde derecho
                    valArriba(posX, posY);
                    valIzda(posX, posY);
                    valAbajo(posX, posY);
                }else{ //Si está en la posiciones centrales
                    valArriba(posX, posY);
                    valDcha(posX, posY);
                    valIzda(posX, posY);
                    valAbajo(posX, posY);
                }
                break;
            case 3: //Si se encuentra en la fila inferior
                if (posY == 0){//Si está en la esquina izquierda
                    valArriba(posX, posY);
                    valDcha(posX, posY);
                } else if (posY == 3){ //Si está en la esquina derecha
                    valArriba(posX, posY);
                    valIzda(posX, posY);
                }else{ //Si está en la posiciones centrales
                    valArriba(posX, posY);
                    valDcha(posX, posY);
                    valIzda(posX, posY);
                }
                break;
        }

    }

    //Funciones para validar si un movimiento es permitido al comprobar si junto al botón hay un espacio vacío
    private void valArriba(int x, int y){//Se reciben las coordenadas de ubicación dentro de la matriz
        String temporalEtiqueta;//Auxiliar para hacer el cambio
        if (etiquetas[x-1][y] == ""){//¿Arriba esta vacío?
            //Intercambio de los valores de la matriz
            temporalEtiqueta = etiquetas[x][y];
            etiquetas[x][y] = etiquetas[x-1][y];
            etiquetas[x-1][y] = temporalEtiqueta;
            //Refrescamos las etiquetas de los botones
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
        if (etiquetas[x+1][y] == ""){//¿Abajo esta vacío?
            temporalEtiqueta = etiquetas[x][y];
            etiquetas[x][y] = etiquetas[x+1][y];
            etiquetas[x+1][y] = temporalEtiqueta;
            llenarBotones();
        }
    }

    private void valIzda(int x, int y){
        String temporalEtiqueta;
        if (etiquetas[x][y-1] == ""){//¿A la izquierda esta vacío?
            temporalEtiqueta = etiquetas[x][y];
            etiquetas[x][y] = etiquetas[x][y-1];
            etiquetas[x][y-1] = temporalEtiqueta;
            llenarBotones();
        }
    }

    //Función para mostrar u ocultar el mensaje de victoria en función a la bandera.
    private void comprobarJuego(){
        if (bandera == true){
            tvExito.setText("¡Felicidades, has ganado :)!");
        }else{
            tvExito.setText("");
        }
    }


}
