package com.dragon.learn.state;

/**
 * Created by dragon on 17-7-11.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
