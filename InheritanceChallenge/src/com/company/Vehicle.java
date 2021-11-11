package com.company;

public class Vehicle {

    private boolean isMoving;

    public Vehicle(boolean moving) {
        this.isMoving = moving;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }
}
