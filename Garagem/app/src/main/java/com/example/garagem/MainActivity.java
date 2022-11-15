package com.example.garagem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder txtConfirmacao = new AlertDialog.Builder(MainActivity.this);
        txtConfirmacao.setTitle("Confirmação");
        txtConfirmacao.setMessage("Deseja reservar essa vaga?");


        Button a1 = findViewById(R.id.btn_A1);
        TextView tt = findViewById(R.id.textView1);

        Object [][] vaga = new Object[12][4];
        vaga[0][0] = a1.toString();
        vaga[0][1] = "alam";
        vaga[0][2] = "giriponga";
        vaga[0][3] = false;

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tt.setText(vaga[0][1].toString());
                if(vaga[0][3].equals(false)){
                txtConfirmacao.create().show();
                vaga[0][3] = true;

                }
            }
        });
    }
}