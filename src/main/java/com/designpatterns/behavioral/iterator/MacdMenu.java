package com.designpatterns.behavioral.iterator;

import java.util.Iterator;

public class MacdMenu implements Menu {

    private MenuItem[] menuItems = new MenuItem[3];

    public MacdMenu() {
        menuItems[0] = addItem("Veg Burger", "Burger with cheese", true, 100.00);
        menuItems[2] = addItem("Chicken Burger", "Burger with cheese", false, 200.00);
    }

    private MenuItem addItem(final String name, final String desc, final boolean vegetarian, final double price) {
        return new MenuItem(name, desc, vegetarian, price);
    }

    public Iterator iterator() {
        return new MacdMenuIterator(menuItems);
    }
}

class MacdMenuIterator implements Iterator {
    private MenuItem[] menuItems;
    private int position = 0;

    public MacdMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
