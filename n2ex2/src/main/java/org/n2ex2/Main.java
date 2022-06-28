package org.n2ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        list.add(new Persona("Ernest", "Company", 30));
        list.add(new Persona("Marta", "Puig", 40));
        list.add("Hola");
        list.add(42);

        GenericMethods.printGenericString(list);

    }
}