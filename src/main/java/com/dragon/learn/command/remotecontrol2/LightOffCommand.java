package com.dragon.learn.command.remotecontrol2;

import com.dragon.learn.command.remotecontrol.Command;
import com.dragon.learn.command.remotecontrol.Light;

/**
 * Created by dragon on 17-7-9.
 */
public class LightOffCommand implements Command {

    Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
