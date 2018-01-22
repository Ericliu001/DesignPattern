package com.ericliu.developer.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {

    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    ArrayList<Menu> menus;

    public Waitress() {
        menus = new ArrayList<Menu>();

        pancakeHouseMenu = new PancakeHouseMenu();
        dinerMenu = new DinerMenu();
        cafeMenu = new CafeMenu();

        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(cafeMenu);
    }

    public void printAllMenus() {

        // ArrayList<MenuItem> pancakeMenuList =
        // pancakeHouseMenu.getMenuItems();
        // for (int i = 0; i < pancakeMenuList.size(); i++) {
        // System.out.print(pancakeMenuList.get(i).getName() + ", ");
        // }
        // System.out.println("\n");
        //
        // MenuItem[] dinerMenuArray = dinerMenu.getMenuItems();
        //
        // for (int i = 0; i < dinerMenuArray.length; i++) {
        // if (dinerMenuArray[i] != null) {
        //
        // System.out.print(dinerMenuArray[i].getName() + ", ");
        // }
        // }

//		mIterator = pancakeHouseMenu.createIterator();
//		while (mIterator.hasNext()) {
//
//			System.out.print(mIterator.next().getName() + ", ");
//		}
//		
//		System.out.println("\n");
//
//		mIterator = dinerMenu.createIterator();
//		while (mIterator.hasNext()) {
//
//			System.out.print(mIterator.next().getName() + ", ");
//		}

        for (Menu menu : menus) {
            Iterator<MenuItem> iterator = menu.createIterator();

            while (iterator.hasNext()) {

                System.out.print(iterator.next().getName() + ", ");
            }

            System.out.println("\n");
        }
    }
}
