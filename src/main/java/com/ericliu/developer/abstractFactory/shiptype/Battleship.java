package com.ericliu.developer.abstractFactory.shiptype;


import com.ericliu.developer.abstractFactory.shipyard.Shipyard;

public class Battleship extends BaseShip {
	


	public Battleship(Shipyard yard) {
		super(yard);
	}

	@Override
	public void prepare() {
		weapon = yard.addBigGun();
		engine = yard.addBigEngine();
	}

	

}
