package com.ranjan.java;

import java.util.ArrayList;

public class QuickSort {
    public static void main(String[] args) {
        //int[] arr = {1,6,8,2,10};
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(6);
        arr.add(8);
        arr.add(2);
        arr.add(10);
        for (int i : sort(arr)) {
            System.out.println("sort "+i);
        }
    }
    
    public static ArrayList<Integer> sort(ArrayList<Integer> arr) {
        if (arr.size()<2) {
            return arr;
        }
        else {
            Integer pivot = arr.get(0);
            ArrayList<Integer> lesserSubArr = new ArrayList<Integer>();
            ArrayList<Integer> greaterSubArr = new ArrayList<Integer>();
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i)<= pivot) {
                    lesserSubArr.add(arr.get(i));
                }
                if (arr.get(i)>pivot) {
                    greaterSubArr.add(arr.get(i));
                }
            }
            ArrayList<Integer> result = new ArrayList<Integer>();
            result.addAll(sort(lesserSubArr));
            result.add(pivot);
            result.addAll(sort(greaterSubArr));
            return result;
        }
    }
}
