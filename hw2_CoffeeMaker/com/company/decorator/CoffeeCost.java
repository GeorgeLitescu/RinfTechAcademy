package com.company.decorator;

public class CoffeeCost {
    private double cost;

    public CoffeeCost() {
        this.cost = 2;
    }

    public void printCost() {
        System.out.println("Cost for coffee is " + this.cost);
    }

    public void addIngredients(CoffeePack pack) {
        this.cost = this.cost + 0.5 * (pack.getMilk() + pack.getSugar());
        this.printCost();
    }

    public double getCost() {
        return this.cost;
    }

}
