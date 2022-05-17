package com.designpatterns.structural.composite;

/**
 * A component abstract class to represent both individual and composite classes
 */
public abstract class MenuComponent {
    public void add(final MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(final MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(final int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }


}
