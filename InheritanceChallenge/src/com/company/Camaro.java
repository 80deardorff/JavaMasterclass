package com.company;

public class Camaro extends Car{
    private int gear;

    public Camaro(int gear) {
        super(false, 0);
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
