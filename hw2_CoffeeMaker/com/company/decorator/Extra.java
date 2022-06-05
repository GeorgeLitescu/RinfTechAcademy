package com.company.decorator;

public class Extra extends Decorator {


    public Extra(CoffeeMaker coffeeMaker) {
        super(coffeeMaker);
    }

    @Override
    public void makeCoffee(CoffeePack pack) {
        super.makeCoffee(pack);

        for (int i = 0; i < pack.getMilk(); i++) {
            System.out.print(", Milk");
        }

        for (int i = 0; i < pack.getSugar(); i++) {
            System.out.print(", Sugar");
        }
    }
}
