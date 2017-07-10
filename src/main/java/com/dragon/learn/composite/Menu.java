package com.dragon.learn.composite;



import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

/**
 * Created by dragon on 17-7-10.
 */
public class Menu extends MenuComponent {
    List<MenuComponent> menuComponentList = new ArrayList();
    String name;
    String description;

    public Menu(String name,String description){
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponentList.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print(){
        System.out.println("\n"+getName());
        System.out.println(",  "+getDescription());
        System.out.println("____________________");
        Iterator<MenuComponent> iterator = menuComponentList.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponentList.iterator());
    }
}
