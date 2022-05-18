package com.designpatterns.behavioral.state;

public class Walk implements BirdsState{
    private BirdFlyingMachine birdFlyingMachine;

    public Walk(BirdFlyingMachine birdFlyingMachine) {
        this.birdFlyingMachine = birdFlyingMachine;
    }

    @Override
    public void handle() {
        System.out.println("::::::::::::::::::::::::I can just walk now::::::::::::::::::::::::");
        birdFlyingMachine.setCurrentState(birdFlyingMachine.getSleepState());
    }
}
