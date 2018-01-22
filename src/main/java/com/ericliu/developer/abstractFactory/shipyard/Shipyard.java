package com.ericliu.developer.abstractFactory.shipyard;

import com.ericliu.developer.abstractFactory.component.Engine;
import com.ericliu.developer.abstractFactory.component.Weapon;

public interface Shipyard {

    Weapon addBigGun();

    Weapon addSecondaryGun();

    Engine addBigEngine();

    Engine addMediumEngine();
}
