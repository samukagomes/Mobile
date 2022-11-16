package com.example.garagem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*Variavel para pegar os IDs dos btn*/
    String[] capturaId;

    /*ID dos btn*/
    Button a1 = findViewById(R.id.btn_A1);
    /*
    Button a2 = findViewById(R.id.btn_A2);
    Button a3 = findViewById(R.id.btn_A3);
    Button a4 = findViewById(R.id.btn_A4);
    Button a5 = findViewById(R.id.btn_A5);
    Button a6 = findViewById(R.id.btn_A6);
    Button a7 = findViewById(R.id.btn_A7);
    Button a8 = findViewById(R.id.btn_A8);
    Button a9 = findViewById(R.id.btn_A9);
    Button a10 = findViewById(R.id.btn_A10);
    Button a11 = findViewById(R.id.btn_A11);
    Button a12 = findViewById(R.id.btn_A12);
    */
    TextView tt = findViewById(R.id.textView1);


    /*array para vagas*/
    /*0 = id vaga, 1 = nome vaga, 2 = email usuario, 3 = confirmação de ocupação*/
    Object[][] vaga = new Object[11][3];

        vaga[0][0] = a1.toString();
        vaga[0][1] = "a1";
        /*vaga[1][0] = a2.toString();
        vaga[1][1] = "a2";
        vaga[2][0] = a3.toString();
        vaga[2][1] = "a3";
        vaga[3][0] = a4.toString();
        vaga[3][1] = "a4";
        vaga[4][0] = a5.toString();
        vaga[5][1] = "a5";
        vaga[5][0] = a6.toString();
        vaga[5][1] = "a6";
        vaga[6][0] = a7.toString();
        vaga[6][1] = "a7";
        vaga[7][0] = a8.toString();
        vaga[7][1] = "a8";
        vaga[8][0] = a9.toString();
        vaga[8][1] = "a9";
        vaga[9][0] = a10.toString();
        vaga[9][1] = "a10";
        vaga[10][0] = a11.toString();
        vaga[10][1] = "a11";
        vaga[11][0] = a12.toString();
        vaga[11][1] = "a12";
       */



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*BOTÔES*/
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*validacao(a1);*/
            }
        });
    }

    private void validacao(Button button) {
        /*inicio do metodo de validação*/
        int i=0;
        int j=0;

        capturaId[0] = button.toString();
        while (capturaId[0].equals(vaga[i][j]) == false){
            i++;}

        if(vaga[i][3].equals(true)){
            textoErro();
        }
        else {
            textoConfirmação();
            vaga[i][3] = true;
            button.setBackgroundResource(R.color.vermelho);
        }
    }

    private void textoErro() {
        AlertDialog.Builder txtErro = new AlertDialog.Builder(MainActivity.this);
        txtErro.setTitle("A vaga esta reservada");
        txtErro.setMessage("Esta vaga já esta reservada :(\nPor favor escolha outra vaga");
        txtErro.create().show();
    }

    private void textoConfirmação() {
        AlertDialog.Builder txtConfirmacao = new AlertDialog.Builder(MainActivity.this);
        txtConfirmacao.setTitle("Confirmação");
        txtConfirmacao.setMessage("Deseja reservar a vaga?");
        txtConfirmacao.create().show();
    }
}