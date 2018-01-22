package com.ericliu.developer.bridge;

/**
 * Created by ericliu on 15/03/2016.
 */
public class SlowCarControl extends CarControl {

    private static final float TIMES_OF_SPEED = 0.8f;

    public SlowCarControl(Car car) {
        super(car);
    }

    @Override
    protected void moveLeft(float distance) {
        car.moveLeft(distance * TIMES_OF_SPEED);
    }

    @Override
    protected void moveRight(float distance) {
        car.moveRight(distance * TIMES_OF_SPEED);
    }
}
