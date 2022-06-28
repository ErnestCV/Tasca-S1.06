package org.n1ex1;

public class Main {
    public static void main(String[] args) {

        //Els mètodes es poden posar en qualsevol posició en la crida al constructor, la classe només admet objectes de tipus "Persona"

        NoGenericMethods noGenericMethods = new NoGenericMethods(new Persona("A", 10), new Persona("B", 20), new Persona("C", 30));

    }
}