package com.company.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgrammin {

    public static List<String> upperCase(List<String> list) {
        return list.
                stream().
                map(String::toUpperCase).
                collect(Collectors.toList());
    }

    public static double average(List<String> list) {
        return list.
                stream().
                mapToInt(Integer::parseInt).
                average().
                orElse(0);
    }

    public static List<String> search(List<String> list) {
        return list.
                stream().
                filter(s -> s.charAt(0) == 'r' && s.length() == 6).
                collect(Collectors.toList());
    }

    public static String evenAndOdd(List<Integer> list) {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
                result += "i";
            else result += "r";

            result += list.get(i);
            if (i < list.size() - 1) result += ","; //do not add ',' if this is last element

        }
        return result;
    }

    public static int counter(List<String> list) {
        list = list.
                stream().
                filter(s -> s.length() > 4).
                collect(Collectors.toList());   //keeps only words > 4 letters

        int k = 0;
        for (int i = 0; i < list.size(); i++)
            k += list.get(i).length();

        return k;
    }

    public static void main(String[] args) {

        //bp1
        System.out.println(upperCase(List.of("ana", "aRe", "MeRe")));

        //bp2
        try {
            System.out.println(average(List.of("5", "8", "17")));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //bp3
        System.out.println(search(List.of("rica", "rarara", "barararara", "lala", "Rarara", "ratatataR")));

        //bp4
        System.out.println(evenAndOdd(List.of(7, 20, 54, 21, 77)));

        //bp5
        System.out.println(counter(List.of("rinf", "tech", "academy", "programming")));
    }
}
