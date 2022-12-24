package org.tr.cake;

public class Cake {
    public IFruit fruit;

    public Cake(IFruit fruit) {
        this.fruit = fruit;
    }

    public String getAppleColour() {
        return fruit.getColour();
    }
}
