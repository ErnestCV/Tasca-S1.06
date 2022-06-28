package org.n2ex2;

import java.util.List;

public class GenericMethods {

    public static <T> void printGenericString(List<T> list) {

        list.forEach(System.out::println);

    }
}

