package com.ranjan.java;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Scanner;

public class Logic {
    public static void main(String[] args) {        
        //System.out.println(checkAnagram("accept","expect"));
        hashMapDemo();
    }

    public static void sumOfNumber(int n) {
        int remainder = 0;
        int quotient = n;
        int sum = 0;
        while (quotient > 0) {
            remainder = quotient % 10;
            sum = sum + remainder;
            quotient = quotient / 10;
        }
        System.out.println(sum);
    }

    public static void factorsOfNumber() {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scannerObj.nextInt();
        scannerObj.close();
        for (int i = 1; i < n+1; i++) {
            if (n % i == 0) {
                System.out.println(i);   
            }   
        }
    }

    public static void isPrime() {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scannerObj.nextInt();
        scannerObj.close();
        for (int i = 1; i < n+1; i++) {
            if (n % i == 0) {
                System.out.println(i);   
            }   
        }
    }

    public static void hollowSquare() {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the length of the side of the square:");
        int n = scannerObj.nextInt();
        scannerObj.close();
        for (int x = 0; x <n; x++) {
            for (int y = 0; y <n; y++) {
                if (x == 0 || x == n - 1 || y == 0 || y == n - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                
            }
            System.out.println(" ");
        }
    }

    public static void nearestPowerof2() {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scannerObj.nextInt();
        scannerObj.close();
        int pwr = 0;
        int i = 0;
        pwr = (int)Math.pow(2, i);
        int lastPower = 0;
        int diff1, diff2 ;
        while (pwr < num) {
            lastPower = pwr;
            i++;
            pwr = (int)Math.pow(2, i);
        }

        diff1 = num - lastPower;
        diff2 = pwr - num;

        if (diff2>=diff1) {
            pwr = lastPower;
        }
        System.out.println("The "+ pwr + " is the power of 2 nearest to " + num + "." );
    }

    public static void reverseString() {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the String:");
        String input = scannerObj.nextLine();
        scannerObj.close();
        for(int i= input.length() -1 ;i>=0;i--){
            System.out.println(input.charAt(i));
        }
    }

    public static void leftShiftString() {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the String:");
        String input = scannerObj.nextLine();
        scannerObj.close();
        for(int i= 1 ;i < input.length();i++){
            System.out.print(input.charAt(i));
        }
    }

    public static void palindromTest() {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the String:");
        String input = scannerObj.nextLine();
        scannerObj.close();
        Boolean isPalindrome = false;
        for(int i= 0 ;i < input.length();i++){
            if (input.charAt(i) != input.charAt(input.length()-1 - i)) {                
                isPalindrome = false;
                break;
            }
            else {
                isPalindrome = true;
            }
        }
        System.out.print( isPalindrome ? "Palindrome" :"Not Palindrome");
    }

    public static void adjacent() {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n = scannerObj.nextInt();
        int [] array = new int[n];
        int [] array2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements of the array: "+i);  
            array[i] = scannerObj.nextInt();
        }
        scannerObj.close();
        for (int i = 0; i < n; i++) {
            array2[i] = i+1 < n ? array[i] + array[i+1] : array[i];
            System.out.println("Print the elements of the array: "+i);
            System.out.println(array2[i]);
        }
    }

    public static void arrayIsPalindrome() {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n = scannerObj.nextInt();
        String [] array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements of the array: "+i);  
            array[i] = scannerObj.next();
        }
        scannerObj.close();
        Boolean isPalindrome = true;
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]+"check "+array[n-1-i]);
            if (array[i].equals(array[n-1-i]) == false) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Palindrome check "+isPalindrome);
    }

    public static void sumOfColumnsMatrix() {
        int[][] matrixA = {{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
        {10, 11, 12, 13, 14, 15, 16, 17, 18, 19},
        {20, 21, 22, 23, 24, 25, 26, 27, 28, 29},
        {30, 31, 32, 33, 34, 35, 36, 37, 38, 39},
        {40, 41, 42, 43, 44, 45, 46, 47, 48, 49}}; 
        int[] sum = new int[10];
        for (int i = 0; i < 10; i++) {
            int sumColumn = 0 ;
            for (int j = 0; j < 5; j++) {
                sumColumn += matrixA[j][i];                
            }
            sum[i] = sumColumn;
            //System.out.print(sumColumn +" ");
        }
        System.out.println("Sum array is :");
        for (int i = 0; i < 10; i++) {
            System.out.print(sum[i]+ " ");
        }
    }

    public static void sortArray() {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n = scannerObj.nextInt();
        int [] array = new int[n];
        int temp = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements of the array: "+i);  
            array[i] = scannerObj.nextInt();
        }
        scannerObj.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array is :");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]+ " ");
        }
    }

    public static void outlierAPIndex() {
        int[] array1 = {5,8,11,13,17};
        int n = array1.length;
        int idx = -1;
        if (n<5) {
            idx = 0;
            System.out.println(idx);
            return;
        }
        int first = array1[0];
        int second = array1[1];
        int ap = second - first;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-1; j++) {
                if (array1[j] - array1[i] != ap) {
                    idx = i;
                }
            }
        }
        System.out.println("idx "+idx);
        
    }

    public static void showTableOf4() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("4 x "+ i + " = " + (4 * i));
        }
    }

    public static int checkAnagram(String str1, String str2){
    // Write your code here    
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    int str1charLength = str1.length();
    for (char str1Char : str1.toCharArray()) {
        for (char str2Char : str2.toCharArray()) {
            if (str1Char == str2Char ) {
                str1charLength--;
            }
        }
    }
    return str1charLength == 0 ? 1 : -1;
    }

    public static void arrayDemo() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
			System.out.println("Next element is " + listIterator.next() + 
			" and next index is " + listIterator.nextIndex());
			
		}
        /*List<Integer> sortedList = list.stream().flatMap(Collection::stream)
        .map(ob->(Integer)ob).collect(Collectors.toList());
        System.out.println(sortedList);*/
    }

    public static void hashMapDemo() {
        Map<String, Integer> stockPrice = new HashMap<>();
		stockPrice.put("Oracle", 56);
		stockPrice.put("Fiserv", 117);
		stockPrice.put("BMW", 73);
		stockPrice.put("Microsoft", 213);
		stockPrice.put("Google", 421);
		stockPrice.put("Ford", 456);
		stockPrice.put("Novartis", 43);
		stockPrice.put("TCS", 23);

        //find highest stockprice
        Set<Entry<String,Integer>> entrySet = stockPrice.entrySet();
        String companyMaxStock = "";
        for (Entry<String,Integer> entry : entrySet) {
            Integer maxPrice = entry.getValue();
            companyMaxStock = entry.getKey();
            for (Entry<String,Integer> entry2 : entrySet) {
                if (entry2.getValue() > maxPrice) {
                    maxPrice = entry2.getValue();
                    companyMaxStock = entry2.getKey();
                }
            }
            break;
        }
        System.out.println("Max Stock "+companyMaxStock);
        //Average Stock Price
        Integer sum = 0;
        for (Entry<String,Integer> entry : entrySet) {
            sum += entry.getValue();
        }
        System.out.println("Avg Stock "+Math.floorDiv(sum, entrySet.size()));
        Iterator<Entry<String, Integer>> itr = entrySet.iterator(); 
        //Remove companies less than 50 
        while (itr.hasNext()) {
			Entry<String,Integer> entry = itr.next();
			if(entry.getValue()<50) {
				itr.remove();
			}
		}
        System.out.println("Remove Stock "+stockPrice);
    }
}
