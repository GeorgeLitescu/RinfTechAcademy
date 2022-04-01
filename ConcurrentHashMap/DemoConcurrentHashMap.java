package com.company;

import java.util.concurrent.ConcurrentHashMap;

public class DemoConcurrentHashMap {

    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> demoMap = new ConcurrentHashMap<>();

        //Add elements to map
        demoMap.put("first", 1234);
        demoMap.put("second", 2345);
        demoMap.put("third", 3456);

        System.out.println("Check if a key exists or not");
        System.out.println(demoMap.containsKey("second"));
        System.out.println(demoMap.containsKey("fourth") + "\n");

        System.out.println("Check if a value exists or not");
        System.out.println(demoMap.containsValue(2345));
        System.out.println(demoMap.containsValue(4567) + "\n");

        System.out.println("Find the size of ConcurrentHashMap");
        System.out.println(demoMap.size() + "\n");

        System.out.println("Loop over ConcurrentHashMap and print key, value");
        for (String key : demoMap.keySet())
            System.out.println(key + ", " + demoMap.get(key));

        System.out.println("\nAdd keys only if its not present");
        demoMap.putIfAbsent("third", 3210); //this does nothing
        demoMap.putIfAbsent("fourth", 4567); //this adds value to map
        System.out.println(demoMap + "\n");

        System.out.println("Replace a mapping");
        demoMap.replace("first", 1111); //replaces "first"
        demoMap.replace("fifth", 5678); //does nothing
        System.out.println(demoMap + "\n");

        System.out.println("Remove key values");
        demoMap.remove("fourth");
        System.out.println(demoMap + "\n");

        System.out.println("Remove key values while iterating\n");
        for (String key : demoMap.keySet())
            demoMap.remove(key);

        System.out.println("Check if empty");
        System.out.println(demoMap.isEmpty());
    }
}
