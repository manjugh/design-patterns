package com.designpatterns.behavioral.iterator;

import java.util.Iterator;

public class Client {

    private DominosMenu dominosMenu;

    private MacdMenu macdMenu;

    public Client(DominosMenu dominosMenu, MacdMenu macdMenu) {
        this.dominosMenu = dominosMenu;
        this.macdMenu = macdMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> iterator = dominosMenu.iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }
        Iterator<MenuItem> macdIterator = macdMenu.iterator();
        while (macdIterator.hasNext()) {
            macdIterator.next().print();
        }
    }

    public static void main(String[] args) {
        DominosMenu dominosMenu = new DominosMenu();
        MacdMenu macdMenu = new MacdMenu();

        new Client(dominosMenu,macdMenu).printMenu();
    }
}
