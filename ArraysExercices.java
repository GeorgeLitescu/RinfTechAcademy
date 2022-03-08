package com.company;

public class ArraysExercices {

    public static void main(String[] args) {

        //int[] array = {5, 6, 20, 11};

        System.out.println(getAverageNumber(5, 6, 20, 11));
        System.out.println(findNumber(11, 5, 6, 20, 11));
        System.out.println("Max: " + getMaximumValue(5, 6, 20, 11));
        System.out.println("Min: " + getMinimumValue(5, 6, 20, 11));
    }

    static double getAverageNumber(int... array) {
        double sum = 0;

        for (int value : array) {
            sum += value;
        }

        return (sum / array.length);
    }

    static boolean findNumber(int target, int... array) {
        boolean numberExists = false;

        for (int value : array) {
            if (value == target)
                numberExists = true;
        }

        return numberExists;
    }

    static int getMaximumValue(int... array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }

        return max;
    }

    static int getMinimumValue(int... array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }

        return min;
    }
}
