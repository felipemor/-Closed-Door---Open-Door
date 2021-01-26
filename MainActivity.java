 package com.example.meuprimeiroprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private  Porta porta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        porta = new Porta();

        porta.corPorta = "Marrom";
        porta.estadodaPorta = "Fechada";
        System.out.println("A Cor do corro é "+ porta.corPorta + " e o estado da porta é "+ porta.estadodaPorta);
        porta.AngulodePorta();
         }
}