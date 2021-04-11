package com.engeto;

import java.util.Objects;

public class Vyraz {
    String a;
    String operace;
    String b;

    public Vyraz() {
    }

    public Vyraz(String a, String operace, String b) {;
        this.a = a;
        this.operace = operace;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getOperace() {
        return operace;
    }

    public void setOperace(String operace) {
        this.operace = operace;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vyraz vyraz = (Vyraz) o;
        return Objects.equals(a, vyraz.a) && Objects.equals(b, vyraz.b) && Objects.equals(operace, vyraz.operace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, operace);
    }

    @Override
    public String toString() {
        return "Vyraz{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", operace='" + operace + '\'' +
                '}';
    }
}
