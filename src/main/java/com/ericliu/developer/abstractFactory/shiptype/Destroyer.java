package com.ericliu.developer.abstractFactory.shiptype;

import com.ericliu.developer.abstractFactory.shipyard.Shipyard;

public class Destroyer extends BaseShip {

    public Destroyer(Shipyard yard) {
        super(yard);
    }

    @Override
    public void prepare() {
        weapon = yard.addSecondaryGun();
        engine = yard.addMediumEngine();
    }
}
