package com.designpatterns.behavioral.state;

public class Fly implements BirdsState {
    private BirdFlyingMachine birdFlyingMachine;

    public Fly(BirdFlyingMachine birdFlyingMachine) {
        this.birdFlyingMachine = birdFlyingMachine;
    }

    @Override
    public void handle() {
        System.out.println("::::::::::::::::::::::::I can fly:::::::::::::::::::::::::::::::");
        birdFlyingMachine.setCurrentState(birdFlyingMachine.getHopState());
    }
}


