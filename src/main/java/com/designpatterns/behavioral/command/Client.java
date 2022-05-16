package com.designpatterns.behavioral.command;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOnCommand);
        //Switching on
        remoteControl.trigger();
        //Switching off
        remoteControl.setCommand(lightOffCommand);
        remoteControl.trigger();
        remoteControl.undo();
    }
}
