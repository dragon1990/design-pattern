package com.dragon.learn.factory.abstractfactory;

/**
 * Created by dragon on 17-7-9.
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSause();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
