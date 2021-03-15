package com.engeto;

import java.math.BigDecimal;

public class BigDecimalExample {

    public static void main(String[] args){
        BigDecimal a = BigDecimal.valueOf(2.5);
        BigDecimal b = BigDecimal.valueOf(3);

        BigDecimal vysledek = a.multiply(b);

        System.out.println(vysledek);

    }
}
