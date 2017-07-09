package com.dragon.learn.factory.simplefactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dragon on 17-7-8.
 */
public abstract class Pizza {

    private String name;
    private String dough;
    private String sauce;
    List<String> toppings = new ArrayList();

    public void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings :");
        for(String topping:toppings){
            System.out.println(topping);
        }
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println(" Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Plcae pizza in offical PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }
}
