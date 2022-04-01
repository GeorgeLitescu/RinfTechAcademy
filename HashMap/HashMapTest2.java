package com.company;

import java.util.*;

//Tried to use LocalDate but i decide that it was not a good idea for this application

class CompoundKey2 {
    protected String month;
    protected int year;

    CompoundKey2(String month, int year) {
        this.month = month;
        this.year = year;
    }

    public String info() {
        return "(" + month + ", " + year + ")";
    }
}

public class HashMapTest2 {
    public static void main(String[] args) {
        HashMap<String, List<String>> conferences = new HashMap<>();

        CompoundKey2 key = new CompoundKey2("September", 2019);

        conferences.put(key.info(), List.of("ch open Zurich", "Oracle Code One SF"));

        key.month = "October";
        conferences.put(key.info(), List.of("JAX London"));

        key.month = "November";
        conferences.put(key.info(), List.of("W-JAX Munich"));

        System.out.println(conferences);
    }
}