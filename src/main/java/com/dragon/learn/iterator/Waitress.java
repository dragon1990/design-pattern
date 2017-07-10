package com.dragon.learn.iterator;

/**
 * Created by dragon on 17-7-10.
 */
public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;

    DinnerMenu dinnerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu,DinnerMenu dinnerMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu(){
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinnerMenu.createIterator();
        System.out.println("Menu\n----\nBreakfast");
        printMenu(pancakeIterator);
        System.out.println("lunch");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()){
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName()+",  ");
            System.out.println(menuItem.getPrice()+" -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
