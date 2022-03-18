package com.company.decorator;

public class CoffeePack {
    private int sugar;
    private int milk;

    public CoffeePack(int milk, int sugar) {
        this.sugar = sugar;
        this.milk = milk;
    }

    public int getSugar() {
        return sugar;
    }

    public int getMilk() {
        return milk;
    }
}
