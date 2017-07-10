package com.dragon.learn.composite;


import java.util.Iterator;

/**
 * Created by dragon on 17-7-11.
 */
public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
