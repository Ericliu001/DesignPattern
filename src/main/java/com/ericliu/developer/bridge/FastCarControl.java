package com.ericliu.developer.bridge;

/**
 * Created by ericliu on 15/03/2016.
 */
public class FastCarControl extends CarControl {
    private static final float TIMES_OF_SPEED = 1.2f;

    public FastCarControl(Car car) {
        super(car);
    }

    @Override
    public void moveLeft(float distance) {
        car.moveLeft(distance * TIMES_OF_SPEED);
    }

    @Override
    public void moveRight(float distance) {
        car.moveRight(distance * TIMES_OF_SPEED);
    }
}
