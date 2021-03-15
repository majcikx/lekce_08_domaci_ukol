package com.engeto;

import org.junit.jupiter.api.Test;

public class Main {

    public static void main(String[] args){
        System.out.println("Ahoj");
    }


    public Integer soucet(Integer a, Integer b){
        return a + b;
    }

    public Integer soucetPlusJedna(Integer a, Integer b){
        return a + b + 1;
    }

    public void nacteniZeSouboru() throws Exception {
        throw new Exception("Chyba");
    }


}
