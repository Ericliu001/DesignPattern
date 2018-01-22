package com.ericliu.developer.abstractFactory.shipyard;

import com.ericliu.developer.abstractFactory.component.Engine;
import com.ericliu.developer.abstractFactory.component.USA16InchGun;
import com.ericliu.developer.abstractFactory.component.USA6InchGun;
import com.ericliu.developer.abstractFactory.component.USAMediumTurbine;
import com.ericliu.developer.abstractFactory.component.USASuperTurbine;
import com.ericliu.developer.abstractFactory.component.Weapon;

public class AmericanShipyard implements Shipyard {

    @Override
    public Weapon addBigGun() {
        return new USA16InchGun();
    }

    @Override
    public Weapon addSecondaryGun() {
        return new USA6InchGun();
    }

    @Override
    public Engine addBigEngine() {
        return new USASuperTurbine();
    }

    @Override
    public Engine addMediumEngine() {
        return new USAMediumTurbine();
    }
}
