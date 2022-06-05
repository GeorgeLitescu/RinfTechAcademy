package com.company;

import java.util.*;

class CompoundKey1 {
    protected String name;
    protected int age;

    CompoundKey1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String info() {
        return "(" + name + ", " + age + ")";
    }
}

public class HashMapTest1 {
    public static void main(String[] args) {
        HashMap<String, List<String>> peerHobbies = new HashMap<>();

        CompoundKey1 key = new CompoundKey1("Peter", 22);

        peerHobbies.put(key.info(), List.of("TV"));

        key.name = "Mike";
        key.age = 48;
        peerHobbies.put(key.info(), List.of("Java", "Cycling", "Movies"));

        System.out.println(peerHobbies);
    }
}
