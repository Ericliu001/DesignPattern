package com.ericliu.developer.abstractFactory.shiptype;


import com.ericliu.developer.abstractFactory.component.Engine;
import com.ericliu.developer.abstractFactory.component.Weapon;
import com.ericliu.developer.abstractFactory.shipyard.Shipyard;

public abstract class BaseShip implements Ship {
	
	protected String name;
	protected Weapon weapon;
	protected Engine engine;
	
	protected Shipyard yard;
	
	public BaseShip(Shipyard yard) {
		this.yard = yard;
		prepare();
	}
	
	public abstract void prepare();

	@Override
	public void sail() {
		engine.outputPower();
	}

	@Override
	public void fire() {
		weapon.launch();
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return  this.getClass().getSimpleName() + " : " + name;
	}

}
