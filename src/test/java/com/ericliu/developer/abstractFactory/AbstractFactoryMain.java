package com.ericliu.developer.abstractFactory;


import com.ericliu.developer.abstractFactory.navy.JapaneseNavy;
import com.ericliu.developer.abstractFactory.navy.USNavy;
import com.ericliu.developer.abstractFactory.shiptype.Ship;

import org.junit.Test;

public class AbstractFactoryMain {

	@Test
	public void testAbstractFactory() {

		JapaneseNavy ijn = new JapaneseNavy();
		Ship yamato = ijn.orderWarship(Ship.ShipTypes.BATTLESHIP);
		yamato.setName("IJN Yamato");
		Ship tojo = ijn.orderWarship(Ship.ShipTypes.DESTROYER);
		tojo.setName("IJN Tojo");
		
		
		USNavy usn = new USNavy();
		Ship missouri = usn.orderWarship(Ship.ShipTypes.BATTLESHIP);
		missouri.setName("USS Missouri");
		Ship chicago = usn.orderWarship(Ship.ShipTypes.DESTROYER);
		chicago.setName("USS Chicago");
		Ship victoria = usn.orderWarship(Ship.ShipTypes.SLOW_BATTLESHIP);
		victoria.setName("USS Victoria");
		
		System.out.println(yamato);
		yamato.fire();
		yamato.sail();
		
		System.out.println(tojo);
		tojo.fire();
		tojo.sail();
		
		System.out.println(missouri);
		missouri.fire();
		missouri.sail();
		
		System.out.println(chicago);
		chicago.fire();
		chicago.sail();
		
		
		System.out.println(victoria);
		victoria.fire();
		victoria.sail();
	}

}
