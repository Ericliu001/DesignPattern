package com.ericliu.developer.abstractFactory.shiptype;

public interface Ship {

    void sail();

    void fire();

    void setName(String name);

    String getName();

    enum ShipTypes {
        BATTLESHIP, DESTROYER, SLOW_BATTLESHIP;
    }
}
