package com.company;

//  worst case scenario is if the target number does not exist in array
//  in this case, time complexity is O(log n)
//  where n is arr.length

public class RecursiveBinarySearch {

    public static boolean binarySearch(int[] arr, int target) {
        return recursiveBinarySearch(arr, target, 0, arr.length - 1);
    }

    public static boolean recursiveBinarySearch(int[] arr, int target, int start, int end) {
        int mid = (start + end) / 2;

        if (start > end) return false;

        if (target < arr[mid])
            return recursiveBinarySearch(arr, target, start, mid - 1);

        else if (target > arr[mid])
            return recursiveBinarySearch(arr, target, mid + 1, end);

        else return true;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9};
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearch(arr, 6));
        System.out.println(binarySearch(arr, 4));
        System.out.println(binarySearch(arr, 10));

    }
}
