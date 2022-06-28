package org.n2ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> list = new ArrayList<>();
        list.add(new Persona("Ernest", "Company", 30));
        list.add(new Persona("Marta", "Puig", 40));

        GenericMethods.printGenericString(list);

        //TODO llista de tipus diferents

    }
}