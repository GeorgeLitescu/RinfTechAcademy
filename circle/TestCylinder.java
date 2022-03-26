package com.company;

import com.company.model.Circle;
import com.company.model.Cylinder;

public class TestCylinder {
    public static void main(String[] args) {

        Circle c = new Cylinder();
        c.setColor("blue");
        c.setRadius(2.0);
        System.out.println(c);  //toString

        System.out.println(((Cylinder)c).getVolume()); //conversion necessary to get access to cylinder specific methods
    }
}
