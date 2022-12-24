package org.tr.cake;

public class Fruit implements IFruit {

    private String colour;
    private String taste;
    private int amount;

    @Override
    public boolean isOk() {
        return true;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
