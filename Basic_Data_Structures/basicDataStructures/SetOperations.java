package com.company.basicDataStructures;

import java.util.*;

public class SetOperations<T> {

    public static <T> Set<T> subtract(Collection<T> a, Collection<T> b) {
        Set<T> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }

    public static <T> Set<T> unite(Collection<T> a, Collection<T> b) {
        Set<T> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    //i already made the intersection for the exercise before
    //so i will just use that

}
