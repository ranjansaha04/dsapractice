package com.ranjan.java;

//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Geeks{
    
    // Function to take input using Scanner class
    static void IOFunction(){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		char ch ='a';
        System.out.println("Enter a");
		while(t-- > 0){
		    
		    // Your code 
            System.out.println("Enter a");
		    int a = sc.nextInt();
            System.out.println("Enter b");
		    float b = sc.nextFloat();
            System.out.println("Enter c");
		    long c = sc.nextLong();
            System.out.println("Enter d");
		    byte d = sc.nextByte();
            System.out.println("Enter s");
		    String s = sc.nextLine();
            System.out.println();
		    System.out.println(b);
		    System.out.println(c);
		    System.out.println(d);
		    System.out.println(s);
		    
		}
		sc.close();
    }
    
}

//{ Driver Code Starts.


class GFG {
    
    // Driver Code
    public static void main (String[] args) {
	    
	       //Creating an object of class Geeks
	       Geeks g = new Geeks();
		
		   //Calling the IOFunction() of class Geeks
		   g.IOFunction();
	}
}
// } Driver Code Ends
