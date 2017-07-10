package com.dragon.learn.iterator;

/**
 * Created by dragon on 17-7-10.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu,dinnerMenu);
        waitress.printMenu();
    }
}
