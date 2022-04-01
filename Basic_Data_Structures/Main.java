package com.company;

import com.company.basicDataStructures.*;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Collection<Integer> a = List.of(1, 2, 4, 5, 7, 8);
        System.out.println("A = " + a);
        Collection<Integer> b = List.of(2, 3, 5, 6, 2, 8, 9, 5, 10);
        System.out.println("B = " + b);
        List<Integer> c = List.of(2, 7, 1, 2, 2, 3, 8, 1, 2, 3, 3, 4, 8, 1);
        System.out.println("C = " + c + "\n");


        FindCommon<Integer> testFindCommon = new FindCommon<>();
        System.out.println("Common elements of A and B using 2 methods:");
        System.out.println(testFindCommon.findCommon1(a, b));
        System.out.println(testFindCommon.findCommon2(a, b) + "\n");

        SetOperations<Integer> testSetOperations = new SetOperations<>();
        System.out.println("A - B = " + testSetOperations.subtract(a, b));
        System.out.println("B - A = " + testSetOperations.subtract(b, a));
        System.out.println("A U B = " + testSetOperations.unite(a, b));
        System.out.println("A ∩ B = " + testFindCommon.findCommon2(a, b) + "\n");

        System.out.println("B without the duplicates: " +
                b.stream().distinct().collect(Collectors.toList()));

        LongestGrow testLongestGrow = new LongestGrow();
        System.out.println(testLongestGrow.findLongestGrowingSequence(c));
    }

}
