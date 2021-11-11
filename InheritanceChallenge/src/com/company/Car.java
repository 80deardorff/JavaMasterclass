package com.company;

public class Car extends Vehicle {
    private int steer;

    public Car(boolean moving, int steer) {
        super(moving);
        this.steer = steer;
    }

    public int getSteer() {
        return steer;
    }

    public void setSteer(int steer) {
        this.steer = steer;
    }
}
