package com.dragon.learn.proxy;

/**
 * Created by dragon on 17-7-11.
 */
public class GumballMachine {
    String location;
    int count;

    public GumballMachine(String location, int count) {
        this.location = location;
        this.count = count;
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }


}
