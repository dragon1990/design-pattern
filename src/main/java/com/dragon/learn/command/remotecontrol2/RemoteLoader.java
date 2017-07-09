package com.dragon.learn.command.remotecontrol2;

import com.dragon.learn.command.remotecontrol.Light;
import com.dragon.learn.command.remotecontrol.LightOnCommand;

/**
 * Created by dragon on 17-7-9.
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remoteControl.setCommand(0, lightOnCommand,lightOffCommand);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
    }
}
