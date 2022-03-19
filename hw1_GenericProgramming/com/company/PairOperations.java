package com.company;

import com.company.Pair;

import java.util.Arrays;

public class PairOperations<T> {

    public Pair<T, T> swap(Pair<T, T> object) {

        return new Pair<>(object.getSecond(), object.getFirst());
    }

    public Pair<T, T> minMax(T... array) {

        Arrays.sort(array);

        return new Pair<>(array[0], array[array.length - 1]);
    }

}
