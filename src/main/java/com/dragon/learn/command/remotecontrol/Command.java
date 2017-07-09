package com.dragon.learn.command.remotecontrol;

/**
 * Created by dragon on 17-7-9.
 */
public interface Command {
    void execute();
    void undo();
}
