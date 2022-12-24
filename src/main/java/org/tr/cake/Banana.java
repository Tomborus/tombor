package org.tr.cake;

public class Banana extends Fruit {
    int length;

    public Banana (String cl, String tst, int am, int l) {
        setColour(cl);
        setTaste(tst);
        setAmount(am);
        length = l;
    }

    @Override
    public boolean isOk() {
        return false;
    }
}
