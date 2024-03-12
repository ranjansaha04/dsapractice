package com.ranjan.java;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {10,3,6,2,10};
        for (int i : sort(arr)) {
            System.out.println(i);
        
        }
        
        System.out.println("sum "+recursivesum(arr));
    }

    private static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]< arr[i]) {
                    int smallest = arr[j];
                    arr[j] = arr[i];
                    arr[i] = smallest;
                }
            }
        }
        return arr;
    }

    private static int recursivesum(int[] arr) {
        int arrlen = arr.length;
        if (arrlen == 0) return 0;
        return arr[0]+ recursivesum(Arrays.copyOfRange(arr, 1, arrlen));
    }
}
