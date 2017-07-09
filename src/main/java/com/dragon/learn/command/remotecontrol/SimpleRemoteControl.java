package com.dragon.learn.command.remotecontrol;

/**
 * Created by dragon on 17-7-9.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){

    }

    public void setCommnad(Command commnad){
        this.slot = commnad;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
