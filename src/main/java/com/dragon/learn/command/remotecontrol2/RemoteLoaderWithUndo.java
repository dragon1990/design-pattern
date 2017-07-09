package com.dragon.learn.command.remotecontrol2;

import com.dragon.learn.command.remotecontrol.Light;
import com.dragon.learn.command.remotecontrol.LightOnCommand;

/**
 * Created by dragon on 17-7-9.
 */
public class RemoteLoaderWithUndo {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remoteControlWithUndo.setCommand(0, lightOnCommand,lightOffCommand);

        remoteControlWithUndo.onButtonWasPressed(0);
        remoteControlWithUndo.offButtonWasPressed(0);
        remoteControlWithUndo.updoButtonWasPressed();

        CellingFan cellingFan = new CellingFan("shaoxing");
        CellingFanHighCommand cellingFanHighCommand = new CellingFanHighCommand(cellingFan);
        CellingFanOffCommand cellingFanOffCommand = new CellingFanOffCommand(cellingFan);
        remoteControlWithUndo.setCommand(1,cellingFanHighCommand,cellingFanOffCommand);

        remoteControlWithUndo.onButtonWasPressed(1);
        remoteControlWithUndo.offButtonWasPressed(1);
        remoteControlWithUndo.updoButtonWasPressed();

    }
}
