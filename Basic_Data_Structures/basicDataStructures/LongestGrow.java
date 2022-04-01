package com.company.basicDataStructures;

import java.util.*;

public class LongestGrow {

    //  I know there probably is a way simpler method to calculate this
    //  but i could not find it so i did it the old way, hope it's ok :)

    public static List<Integer> findLongestGrowingSequence(List<Integer> list) {
        int start = 0, end = 0, size = 0, prev = list.get(0);
        List<Integer> result = new ArrayList<>(prev);

        for (int i = 0; i < list.size(); i++) {
            if (prev <= list.get(i)) {  //if sequence continues growing
                size++;
                end++;
            } else {                                //if sequence stops growing
                if (size > result.size()) {         //if last sequence is longer
                    result = list.subList(start, end + 1);
                }
                size = 1;
                start = i;
                end = i;
            }
            prev = list.get(i);
        }

        return result;
    }


}
