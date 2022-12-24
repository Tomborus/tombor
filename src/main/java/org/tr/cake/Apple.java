package org.tr.cake;

public class Apple extends Fruit {
    int age;

    public Apple(String cl, String tst, int am, int a) {
        setColour(cl);
        setTaste(tst);
        setAmount(am);
        age = a;
    }
}
