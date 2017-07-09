package com.dragon.learn.factory.factorymethod.california;

/**
 * Created by dragon on 17-7-9.
 */
public class CaliforniaStyleCheesePizza extends com.dragon.learn.factory.simplefactory.Pizza {

    public CaliforniaStyleCheesePizza(){
        setName("Chicago Style Deep Dish Cheese Pizza");
        setDough("Extra Thick Crust Dough");
        setSauce("Plum Tomato Sauce");
        getToppings().add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
