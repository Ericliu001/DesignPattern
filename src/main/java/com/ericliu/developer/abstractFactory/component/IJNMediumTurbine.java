package com.ericliu.developer.abstractFactory.component;


public class IJNMediumTurbine implements Engine {

	@Override
	public void outputPower() {
		System.out.println("Go Japan! 20 knot");
	}

}
