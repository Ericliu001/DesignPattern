package com.ericliu.developer.iterator;

import java.util.Iterator;

public class DinerMenu implements Menu {

    public static final int MAX_ITEMS = 6;
    private int numOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {

        menuItems = new MenuItem[MAX_ITEMS];

        MenuItem steak = new MenuItem("Aussie Steak", "Healthy smoky Australian steak", false, 25);
        addItem(steak);

        MenuItem sandwich = new MenuItem("Sandwich", "BLT sandwich is healthy", true, 3.65);
        addItem(sandwich);

        MenuItem fish = new MenuItem("Fried fish", "This fish is from deep sea", false, 3.45);
        addItem(fish);
    }

    public void addItem(MenuItem item) {
        if (numOfItems > MAX_ITEMS) {
            System.out.println("Only " + MAX_ITEMS + " items are allowed to be put in the menu.");
        } else {
            menuItems[numOfItems] = item;
            numOfItems++;
        }
    }
	
	
	/*public MenuItem[] getMenuItems(){
		return menuItems;
	}*/

    public static class DinerMenuIterator implements Iterator<MenuItem> {

        private MenuItem[] menuItems;
        private int position = 0;

        public DinerMenuIterator(MenuItem[] menuItems) {
            this.menuItems = menuItems;
        }

        @Override
        public boolean hasNext() {
            if (position >= MAX_ITEMS || menuItems[position] == null) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public MenuItem next() {
            MenuItem item = menuItems[position];
            position++;
            return item;
        }

        @Override
        public void remove() {
            System.out.println("Do nothing");
        }
    }

    @Override
    public Iterator<MenuItem> createIterator() {

        return new DinerMenuIterator(menuItems);
    }
}
