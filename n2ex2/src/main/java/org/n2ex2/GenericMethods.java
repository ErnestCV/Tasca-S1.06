package org.n2ex2;

import java.util.List;

public class GenericMethods {

    public static void printGenericString(List<?> list) {

        list.forEach(System.out::println);

    }
}

