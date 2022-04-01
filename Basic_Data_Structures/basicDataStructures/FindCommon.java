package com.company.basicDataStructures;

import java.util.*;

public class FindCommon<T> {

    //without matching method
    public static <T> Set<T> findCommon1(Collection<T> a, Collection<T> b) {
        Set<T> result = new HashSet<>();
        List<T> a2List = new ArrayList<>(a);    //conversion to list to get index
        List<T> b2List = new ArrayList<>(b);

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (a2List.get(i).equals(b2List.get(j)))    //compares element to element
                    result.add(a2List.get(i));
            }
        }

        return result;
    }

    //with matching method
    public static <T> Set<T> findCommon2(Collection<T> a, Collection<T> b) {
        Set<T> result = new HashSet<>(a);
        result.retainAll(b);

        return result;
    }

}
