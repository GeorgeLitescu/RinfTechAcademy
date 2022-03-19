package com.company;

public class Test {

    public static void main(String[] args) {

        Pair<Integer, Integer> genericInt = new Pair<>(2, 4);
        Pair<String, String> genericStr = new Pair<>("Hello", "Hi");

        PairOperations<Integer> operationsInt = new PairOperations<>();
        PairOperations<String> operationsStr = new PairOperations<>();

        //Test swap

        System.out.println(genericInt.getFirst());
        System.out.println(genericStr.getSecond());

        System.out.println(operationsInt.swap(genericInt).getFirst());
        System.out.println(operationsStr.swap(genericStr).getSecond());

        //Test minMax

        System.out.println(operationsInt.minMax(3, 6, 7, 1).getFirst()
                + " " + operationsInt.minMax(3, 6, 7, 1).getSecond());

        System.out.println(operationsStr.minMax("Maria", "Ana", "Ioana", "Diana").getFirst()
                + " " + operationsStr.minMax("Maria", "Ana", "Ioana", "Diana").getSecond());

    }
}
