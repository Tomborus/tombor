package org.tr;

public class Army {

    public Tank tank;
    public Soldier soldier;

    public void Army(Tank tank, Soldier soldier) {
        this.tank = tank;
        this.soldier = soldier;
        Tank tank1=new Tank(25,20,15,23);
        Soldier soldier1= new Soldier(25,3);

    }
    public int getValue() {
        return tank.weight * soldier.experience;
    }



}


