package com.company;

public class Main {

    public static void main(String[] args) {
        Camaro camaro = new Camaro(1);
        System.out.println("Camaro is moving: " + camaro.isMoving());
        System.out.println("Current gear: " + camaro.getGear());
    }
}
