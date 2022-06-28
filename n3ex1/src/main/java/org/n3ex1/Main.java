package org.n3ex1;

public class Main {
    public static void main(String[] args) {

        Generica gen = new Generica();
        Smartphone smartphone = new Smartphone();

        gen.m1(smartphone); //El mètode limitat per la interfície no pot cridar un mètode propi d'una classe que la implementa
        gen.m2(smartphone);

    }
}