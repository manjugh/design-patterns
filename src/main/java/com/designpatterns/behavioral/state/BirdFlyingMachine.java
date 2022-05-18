package com.designpatterns.behavioral.state;

public class BirdFlyingMachine {

    private BirdsState flyState;

    private BirdsState walkState;

    private BirdsState hopState;

    private BirdsState sleepState;

    private int energyLevel = 100;

    private BirdsState currentState;

    public BirdFlyingMachine(int energyLevel) {
        this.energyLevel = energyLevel;
        walkState = new Walk(this);
        hopState = new Hop(this);
        sleepState = new Sleep();
        flyState = new Fly(this);
        if (energyLevel == 100) {
            currentState = flyState;
        } else {
            currentState = sleepState;
        }
    }

    public BirdsState getFlyState() {
        return flyState;
    }

    public BirdsState getWalkState() {
        return walkState;
    }

    public BirdsState getHopState() {
        return hopState;
    }

    public BirdsState getCurrentState() {
        return currentState;
    }

    public void setFlyState(BirdsState flyState) {
        this.flyState = flyState;
    }

    public void setWalkState(BirdsState walkState) {
        this.walkState = walkState;
    }

    public void setHopState(BirdsState hopState) {
        this.hopState = hopState;
    }

    public void setCurrentState(BirdsState currentState) {
        this.currentState = currentState;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(final int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public void perform() {
        currentState.handle();
    }

    public BirdsState getSleepState() {
        return sleepState;
    }

    public static void main(String[] args) {
        BirdFlyingMachine birdFlyingMachine = new BirdFlyingMachine(100);
        birdFlyingMachine.perform();
        //state changed after first run
        birdFlyingMachine.perform();
        //state changed after second run
        birdFlyingMachine.perform();
        //state changed after third run
        birdFlyingMachine.perform();

    }
}
