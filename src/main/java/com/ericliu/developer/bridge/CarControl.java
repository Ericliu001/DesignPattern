package com.ericliu.developer.bridge;

/**
 * Created by ericliu on 15/03/2016.
 */
public abstract class CarControl {

    protected Car car;

    public CarControl(Car car) {

        this.car = car;
    }

    protected abstract void moveLeft(float distance);

    protected abstract void moveRight(float distance);
}
