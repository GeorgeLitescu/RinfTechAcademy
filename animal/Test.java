package com.company;

import com.company.animal.Animal;
import com.company.animal.Mammal;
import com.company.animal.Cat;
import com.company.animal.Dog;

public class Test {

    public static void main(String[] args) {

        Animal c = new Cat("Miti");
        Dog d1 = new Dog("Cutu");
        Mammal d2 = new Dog("Bob");

        System.out.println(c);
        System.out.println(d1);
        System.out.println(d2);
        d1.greets();
        ((Dog) d2).greets(d1);

    }
}
