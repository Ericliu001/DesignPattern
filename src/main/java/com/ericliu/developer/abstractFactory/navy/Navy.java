package com.ericliu.developer.abstractFactory.navy;

import com.ericliu.developer.abstractFactory.shiptype.BaseShip;
import com.ericliu.developer.abstractFactory.shiptype.Battleship;
import com.ericliu.developer.abstractFactory.shiptype.Destroyer;
import com.ericliu.developer.abstractFactory.shiptype.Ship;
import com.ericliu.developer.abstractFactory.shiptype.SlowBattleShip;
import com.ericliu.developer.abstractFactory.shipyard.Shipyard;

public abstract class Navy {

    protected Shipyard shipyard;
    protected BaseShip warship;

    public BaseShip orderWarship(Ship.ShipTypes type) {

        switch (type) {
            case BATTLESHIP:
                warship = new Battleship(shipyard);
                break;

            case DESTROYER:
                warship = new Destroyer(shipyard);
                break;

            case SLOW_BATTLESHIP:
                warship = new SlowBattleShip(shipyard);
                break;

            default:
                break;
        }

        return warship;
    }
}
