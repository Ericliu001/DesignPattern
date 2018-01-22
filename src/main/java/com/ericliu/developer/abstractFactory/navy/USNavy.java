package com.ericliu.developer.abstractFactory.navy;

import com.ericliu.developer.abstractFactory.shiptype.BaseShip;
import com.ericliu.developer.abstractFactory.shipyard.AmericanShipyard;

public class USNavy extends Navy {

    public USNavy() {
        shipyard = new AmericanShipyard();
    }
}


