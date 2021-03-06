package com.ericliu.developer.bridge;

/**
 * Created by ericliu on 15/03/2016.
 */
public class BridgeMain {

    public static void main(final String[] args) {
        Car ford = new FordCar();

        CarControl carControl;

        carControl = new FastCarControl(ford);
        carControl.moveLeft(20);
        carControl.moveRight(10);

        carControl = new SlowCarControl(ford);
        carControl.moveLeft(20);
        carControl.moveRight(10);

        System.out.print("\n\n");
        Car toyota = new ToyotaCar();

        carControl = new FastCarControl(toyota);
        carControl.moveLeft(20);
        carControl.moveRight(10);

        carControl = new SlowCarControl(toyota);
        carControl.moveLeft(20);
        carControl.moveRight(10);
    }
}
