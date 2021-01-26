package com.example.meuprimeiroprojeto;

public class Porta {

    public String corPorta;
    public float AngulodePorta;
    public  String estadodaPorta;

    public Porta(){}

    int x = 360;

    public void AngulodePorta (){
    if (x == 0 || x < 180){
        System.out.println("Porta Fechada pois o angulo esta em "+ x);
    }else if (x == 360 || x >= 360){
        System.out.println("Porta Aberta pois o angulo esta em " + x);
    }else{
        System.out.println("Porta precisa de manutenção pois o alinhamento esta incorreto" + x);
    }
    }
}
