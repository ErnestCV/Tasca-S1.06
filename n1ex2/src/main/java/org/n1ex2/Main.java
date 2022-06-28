package org.n1ex2;

public class Main {
    public static void main(String[] args) {

        //Podem passar qualsevol tipus de paràmetre i l'imprimirà

        GenericMethods.printGeneric(new Persona("Ernest", "Company", 30), "Hola", 42);

        GenericMethods.printGeneric(42, "Hola", new Persona("Ernest", "Company", 30));

    }
}