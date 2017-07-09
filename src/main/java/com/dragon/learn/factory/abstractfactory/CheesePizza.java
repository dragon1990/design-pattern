package com.dragon.learn.factory.abstractfactory;

/**
 * Created by dragon on 17-7-9.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;
    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.pizzaIngredientFactory = ingredientFactory;
    }
    @Override
    void prepare() {
        System.out.println("Preparing "+name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSause();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
