package com.ericliu.developer.abstractFactory.shiptype;


import com.ericliu.developer.abstractFactory.shipyard.Shipyard;

public class SlowBattleShip extends BaseShip {

	public SlowBattleShip(Shipyard yard) {
		super(yard);
	}

	@Override
	public void prepare() {
		weapon = yard.addBigGun();
		engine = yard.addMediumEngine();
	}

}
