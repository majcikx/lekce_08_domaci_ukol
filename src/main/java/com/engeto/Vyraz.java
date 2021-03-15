package com.engeto;

import java.util.Objects;

public class Vyraz {

    public Vyraz(){

    }

    public Vyraz(String a, String operace, String b) {
        this.a = a;
        this.operace = operace;
        this.b = b;
    }

    String a;
    String operace;
    String b;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vyraz vyraz = (Vyraz) o;
        return Objects.equals(a, vyraz.a) &&
                Objects.equals(operace, vyraz.operace) &&
                Objects.equals(b, vyraz.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, operace, b);
    }

    @Override
    public String toString() {
        return "Vyraz{" +
                "a='" + a + '\'' +
                ", operace='" + operace + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
