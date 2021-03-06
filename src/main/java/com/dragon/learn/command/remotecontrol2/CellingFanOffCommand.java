package com.dragon.learn.command.remotecontrol2;

import com.dragon.learn.command.remotecontrol.Command;

/**
 * Created by dragon on 17-7-9.
 */
public class CellingFanOffCommand implements Command {

    private CellingFan cellingFan;

    private int preSpeed;

    public CellingFanOffCommand(CellingFan cellingFan){
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        preSpeed = cellingFan.getSpeed();
        cellingFan.off();
    }

    @Override
    public void undo() {
        if(preSpeed == CellingFan.HIGH){
            cellingFan.high();;
        }else if(preSpeed  == CellingFan.MEDIUM){
            cellingFan.medium();
        }else if(preSpeed == CellingFan.LOW){
            cellingFan.low();
        }else if(preSpeed == CellingFan.OFF){
            cellingFan.off();
        }
    }
}
