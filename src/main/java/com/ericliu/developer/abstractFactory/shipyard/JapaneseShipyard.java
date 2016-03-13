package com.ericliu.developer.abstractFactory.shipyard;


import com.ericliu.developer.abstractFactory.component.Engine;
import com.ericliu.developer.abstractFactory.component.IJN16InchGun;
import com.ericliu.developer.abstractFactory.component.IJN6InchGun;
import com.ericliu.developer.abstractFactory.component.IJNMediumTurbine;
import com.ericliu.developer.abstractFactory.component.IJNSuperTurbine;
import com.ericliu.developer.abstractFactory.component.Weapon;

public class JapaneseShipyard implements Shipyard {

	@Override
	public Weapon addBigGun() {
		return new IJN16InchGun();
	}

	@Override
	public Weapon addSecondaryGun() {
		return new IJN6InchGun();
	}

	@Override
	public Engine addBigEngine() {
		return new IJNSuperTurbine();
	}

	@Override
	public Engine addMediumEngine() {
		return new IJNMediumTurbine();
	}

	

}
