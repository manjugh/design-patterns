package com.designpatterns.behavioral.state;

public class Hop implements  BirdsState {
    private BirdFlyingMachine birdFlyingMachine;

    public Hop(BirdFlyingMachine birdFlyingMachine) {
        this.birdFlyingMachine = birdFlyingMachine;
    }

    @Override
    public void handle() {
        System.out.println("::::::::::::::::::::::::I can now hop::::::::::::::::::::::::");
        birdFlyingMachine.setCurrentState(birdFlyingMachine.getWalkState());
    }
}
