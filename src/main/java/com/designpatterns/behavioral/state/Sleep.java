package com.designpatterns.behavioral.state;

public class Sleep implements BirdsState{
    @Override
    public void handle() {
        System.out.println("Game over, I am sleeping");
    }
}
