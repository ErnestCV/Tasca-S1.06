package org.n2ex1;

public class GenericMethods {

    public static <T> void printGenericString(T t1, T t2, String s) {

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(s);

    }
}
