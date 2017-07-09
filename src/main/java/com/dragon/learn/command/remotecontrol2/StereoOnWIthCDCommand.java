package com.dragon.learn.command.remotecontrol2;

import com.dragon.learn.command.remotecontrol.Command;

/**
 * Created by dragon on 17-7-9.
 */
public class StereoOnWIthCDCommand implements Command {

    Stereo stereo;

    public StereoOnWIthCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
