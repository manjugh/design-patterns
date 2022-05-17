package com.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DominosMenu implements Menu{

    private List<MenuItem> menuItemList;

    public DominosMenu() {
        menuItemList = new ArrayList<>();
        menuItemList.add(addItem("Veg pizza", "delicious pizza", true, 100.100));
        menuItemList.add(addItem("Non-veg pizza", "delicious pizza", false, 200.100));
    }

    private MenuItem addItem(final String name, final String desc, final boolean vegetarian, final double price) {
        return new MenuItem(name, desc, vegetarian, price);
    }

    public Iterator iterator(){
        return menuItemList.iterator();
    }

}
