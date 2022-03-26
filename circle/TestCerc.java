package com.company;

import com.company.model.Circle;

public class TestCerc {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());

        System.out.println(c1);     //toString
        System.out.println(c2.getCircumference());
    }
}
