package com.dragon.learn.composite;


import java.util.Iterator;

/**
 * Created by dragon on 17-7-10.
 */
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean isVegetarian;
    double price;

    public MenuItem(String name,String description,boolean isVegetarian,double price){
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public void print() {
        System.out.println("  "+getName());
        if(isVegetarian){
            System.out.println("(v)");
        }
        System.out.println(", "+getPrice());
        System.out.println("   --"+getDescription());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
