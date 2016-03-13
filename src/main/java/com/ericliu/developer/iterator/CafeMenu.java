package com.ericliu.developer.iterator;

import java.util.HashMap;
import java.util.Iterator;


public class CafeMenu implements Menu {
	
	private HashMap<String, MenuItem> menuItems;
	
	
	public CafeMenu() {
		menuItems = new HashMap<String, MenuItem>();
		
		MenuItem mocha = new MenuItem("Mocha coffee", "Mocha is sweet", true, 3.5);
		addItem(mocha);
		
		
		
	}
	
	public void addItem(MenuItem item){
		menuItems.put(item.getName(), item);
	}
	

	@Override
	public Iterator<MenuItem> createIterator() {

		return menuItems.values().iterator();
	}


}
