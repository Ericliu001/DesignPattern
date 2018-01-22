package com.ericliu.developer.bridge;

/**
 * Created by ericliu on 15/03/2016.
 */
public class FordCar implements Car {

    @Override
    public void moveLeft(float distance) {
        System.out.println("Ford moving left, speed " + distance + " km/h ");
    }

    @Override
    public void moveRight(float distance) {
        System.out.println("Ford moving right, speed " + distance + " km/h ");
    }
}
