package com.ranjan.java;

public class Patterns {
    public static void main( String[] args ) {
        pattern7(5);
    } 

    public static void pattern7(int n) {
        for (int i = 0; i <n; i++) {
            for (int x = 0; x < n-i; x++) {
                System.out.print(" ");
            }
            for (int y = 0; y <2*i + 1; y++) {
                System.out.print("*");
            }
            for (int z = 0; z < n-i; z++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void pattern5(int n) {
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    
    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
