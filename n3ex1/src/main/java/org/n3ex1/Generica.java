package org.n3ex1;

public class Generica {

    public <T extends Telefon> void m1(T t) {

        t.trucar("712345678");

    }

    public <T extends Smartphone> void m2(T t) {

        t.trucar("612345678");
        t.ferFotos();

    }

}
