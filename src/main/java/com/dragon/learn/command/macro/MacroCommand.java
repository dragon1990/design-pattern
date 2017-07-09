package com.dragon.learn.command.macro;

import com.dragon.learn.command.remotecontrol.Command;

/**
 * Created by dragon on 17-7-9.
 */
public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands = commands;
    }
    @Override
    public void execute() {
        for(Command command:commands){
            command.execute();
        }
    }

    @Override
    public void undo() {
        System.out.println("no command");
    }
}
