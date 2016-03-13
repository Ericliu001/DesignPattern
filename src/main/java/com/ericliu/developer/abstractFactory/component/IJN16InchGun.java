package com.ericliu.developer.abstractFactory.component;


public class IJN16InchGun implements Weapon {

	@Override
	public void launch() {
		System.out.println(" Japanese 16 inch guns fire! HOOO HOOO HOOO HOOO");
	}

}
