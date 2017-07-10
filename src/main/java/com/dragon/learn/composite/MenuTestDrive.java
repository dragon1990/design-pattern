package com.dragon.learn.composite;

/**
 * Created by dragon on 17-7-10.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("pancake house menu","breakfast");
        MenuComponent dinnerMenu = new Menu("dinner menu","lunch");
        MenuComponent cafeMenu = new Menu("cafe menu","dinner");
        MenuComponent dessertMenu = new Menu("Dessert menu","Dessert of course");

        MenuComponent allMenus = new Menu("all menus ","all menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        dinnerMenu.add(new MenuItem("Pasta" ,"Spaghetti with Marinara Sauce,and a slice of sourdough bread",true,1.59));
        dinnerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie","Apple Pie with a flakey curst,topped with vanilla0",true,1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }
}
