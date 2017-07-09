package com.dragon.learn.command.remotecontrol;

/**
 * Created by dragon on 17-7-9.
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);

        simpleRemoteControl.setCommnad(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        simpleRemoteControl.setCommnad(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();

    }
}
