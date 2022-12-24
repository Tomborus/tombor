package org.tr;

public class Knight {
    private Horse horse;
    private Sword sword;
     int hp;

    public Knight(Horse horse, Sword sword) {
        this.horse = horse; // this wskazuje ktory jest z klasy
        this.sword = sword;
        this.hp = 100;

    }

    public int getValue() {
        return horse.weight * sword.length;
    }

    public void killYourself() {
        hp = 0;
    }
    public void doDamage(int damage){
        hp= hp-damage;
    }

}
