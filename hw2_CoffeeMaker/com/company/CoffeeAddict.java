package com.company;

import com.company.decorator.CoffeeMaker;
import com.company.decorator.CoffeePack;
import com.company.decorator.Extra;
import com.company.decorator.PlainCoffee;

public class CoffeeAddict {

    public static void main(String[] args) {

        CoffeePack pack = new CoffeePack(3, 2);
        PlainCoffee plainCoffee = new PlainCoffee();
        CoffeeMaker coffeeMaker = new Extra(plainCoffee);

        coffeeMaker.makeCoffee(pack);
    }
}
