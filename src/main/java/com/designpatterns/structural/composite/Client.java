package com.designpatterns.structural.composite;

public class Client {

    private MenuComponent menuComponents;

    public Client(MenuComponent menuComponents) {
        this.menuComponents = menuComponents;
    }

    public void print() {
        menuComponents.print();
    }

    public static void main(String[] args) {
        MenuComponent dominos = new Menu("Domins Menu", "Pizzas");
        MenuComponent burger = new Menu("Macd Menu", "Burger");
        MenuComponent coffe = new Menu("coffee Menu", "Coffee");
        burger.add(coffe);

        MenuComponent allMenus = new Menu("ALL Menu", "All menu");

        allMenus.add(dominos);
        allMenus.add(burger);

        Client client = new Client(allMenus);

        client.print();
    }
}
