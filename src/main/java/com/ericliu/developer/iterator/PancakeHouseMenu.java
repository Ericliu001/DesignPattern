package com.ericliu.developer.iterator;

import java.util.ArrayList;
import java.util.Iterator;


public class PancakeHouseMenu implements Menu{

	private ArrayList<MenuItem> menuItems;
	private int position = 0 ;
	
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		MenuItem cheeseCake = new MenuItem("Cheesecake", "Beautiful cheese which will make your taste numb.", true, 3.5);
		addItem(cheeseCake);
		
		MenuItem eggCake = new MenuItem("Egg cake", "A cake made from 8 eggs", true, 2.56);
		addItem(eggCake);
		
		
	
	}
	
	
	public void addItem(MenuItem item){
		menuItems.add(item);
	}
	
	/*public ArrayList<MenuItem> getMenuItems(){
		return menuItems;
	}*/




	@Override
	public Iterator<MenuItem> createIterator() {
		
		return menuItems.iterator();
	}
	
	
}
