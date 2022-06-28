package org.n2ex1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //El darrer argument ha de ser un string

        List<Integer> list = Arrays.asList(1, 2);
        GenericMethods.printGenericString(list, new Persona("Ernest", "Company", 30), "Hola");

    }
}