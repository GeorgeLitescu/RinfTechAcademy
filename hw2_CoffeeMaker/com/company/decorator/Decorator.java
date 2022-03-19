package com.company.decorator;

public class Decorator implements CoffeeMaker {
    private CoffeeMaker coffeeMaker;
    protected CoffeeCost coffeeCost = new CoffeeCost();

    public Decorator(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void makeCoffee(CoffeePack pack) {

        coffeeCost.addIngredients(pack);
        this.coffeeMaker.makeCoffee(pack);
    }
}
