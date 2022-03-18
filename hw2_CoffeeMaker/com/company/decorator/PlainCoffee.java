package com.company.decorator;

public class PlainCoffee implements CoffeeMaker {

    @Override
    public void makeCoffee(CoffeePack pack) {
        System.out.print("Ingredients for coffee are: Plain Coffee");
    }

}
