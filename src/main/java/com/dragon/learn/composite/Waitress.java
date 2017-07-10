package com.dragon.learn.composite;

/**
 * Created by dragon on 17-7-10.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent menuComponent){
        this.allMenus = menuComponent;
    }

    public void printMenu(){
        allMenus.print();
    }
}
