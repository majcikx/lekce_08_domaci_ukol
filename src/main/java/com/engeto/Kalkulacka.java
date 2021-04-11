package com.engeto;


import java.util.SplittableRandom;

public class Kalkulacka {
    public String vypocet(String vstup) {
        Vyraz vyraz = new Vyraz();
        //1. rozdelit na cisla a vyraz
        vyraz = rozdelitNaVyraz(vstup);

        //2. podle vyrazu zavolat spravnou metodu
        Double vysledek = spravnaMetodaPodleOperace(vyraz.a,vyraz.operace,vyraz.b);

        //3. spravne definovane typy - převod na string
        String spravnyTypVysledek = prevodNaString(vysledek);

        //4. vzit vysledek a spravne naformatovat
        formatVysledek(vyraz.a, vyraz.operace, vyraz.b, spravnyTypVysledek);


        return "0";
    }
    public String formatVysledek(String a,String operace ,String b,String spravnyTypVysledek){

        return a + " " + operace +" " + b + " = " + spravnyTypVysledek ;
    }

    public String prevodNaString(Double vysledek){
        return vysledek.toString();
    }


    public Double spravnaMetodaPodleOperace (String a,String operace,String b ){
        Double vysledek= 0.0;


        switch (operace) {
            case "+":
                vysledek = scitani(Double.valueOf(a), Double.valueOf(b));

                break;
            case "*":
                vysledek =nasobeni(Double.valueOf(a), Double.valueOf(b));

                break;
            case "/":
                vysledek = deleni(Double.valueOf(a), Double.valueOf(b));

                break;
            case "-":
                vysledek = odecitani(Double.valueOf(a), Double.valueOf(b));

                break;
            default:
                System.out.println("Zadáná špatná operace");
        }
        return  vysledek;
    }
    public Vyraz rozdelitNaVyraz(String vstup) {
        Vyraz vyraz = new Vyraz();

        String[] buffer = new String[2];
        buffer = vstup.split(" ");

        vyraz.setA(buffer[0]);
        vyraz.setOperace(buffer[1]);
        vyraz.setB(buffer[2]);


        return vyraz;
    }

    public double scitani(Double a, Double b) {
        return a + b;
    }

    public double nasobeni(Double a, Double b) {
        return a * b;
    }

    public double deleni(Double a, Double b) {
        return a / b;
    }

    public double odecitani(Double a, Double b) {
        return a - b;
    }


}
