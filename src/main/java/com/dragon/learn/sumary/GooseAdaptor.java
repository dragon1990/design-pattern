package com.dragon.learn.sumary;

/**
 * Created by dragon on 17-7-11.
 */
public class GooseAdaptor implements Quackable {

    Goose goose;

    public GooseAdaptor(Goose goose){
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
