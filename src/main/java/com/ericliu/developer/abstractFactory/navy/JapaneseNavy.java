package com.ericliu.developer.abstractFactory.navy;


import com.ericliu.developer.abstractFactory.shipyard.JapaneseShipyard;

public class JapaneseNavy extends Navy {

	public JapaneseNavy() {
		shipyard = new JapaneseShipyard();
	}
	

}
