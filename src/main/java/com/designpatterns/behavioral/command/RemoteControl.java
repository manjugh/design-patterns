package com.designpatterns.behavioral.command;

//Invoker
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void trigger() {
        command.execute();
    }

    public void undo() {
        command.undo();
    }
}
