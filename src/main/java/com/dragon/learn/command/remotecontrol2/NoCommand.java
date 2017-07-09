package com.dragon.learn.command.remotecontrol2;

import com.dragon.learn.command.remotecontrol.Command;

/**
 * Created by dragon on 17-7-9.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("no command");
    }

    @Override
    public void undo() {
        System.out.println("no command");
    }
}
