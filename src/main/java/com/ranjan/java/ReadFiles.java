package com.ranjan.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFiles {
    public static void main(String[] args) {
        try {
            ArrayList<ArrayList<String>> dataset = new ArrayList<ArrayList<String>>();
            BufferedReader br = new BufferedReader(new FileReader("/Users/ranjansaha/Downloads/bestsellerswithcategories.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                ArrayList<String> columnValues = new ArrayList<String>();
                for (String str : values) {
                    columnValues.add(str);
                }
                dataset.add(columnValues);
            }
            printData(dataset);
            System.out.println("Number of Books "+authorBooks("Anthony Doerr",dataset));
            br.close();
        } catch (IOException e) {            
            e.printStackTrace();
        }
        
    }

    public static void printData(ArrayList<ArrayList<String>> dataset){
        for (ArrayList<String> row : dataset) {
            for (String columnData : row) {
                System.out.print(columnData+" ");
            }
            System.out.println();
        }
    }

    public static int authorBooks(String author,ArrayList<ArrayList<String>> dataset) {
        ArrayList<String> book = new ArrayList<String>();
        for (ArrayList<String> arrayList : dataset) {
            if (arrayList.contains(author)) {
                book.add(author);
            }
        }
        return 0;
    }

    public static ArrayList<String> allAuthors(String[][] dataset)
    {
        /* Write your code here */
        return null;
    }

    public static ArrayList<String> booksByAuthors(String author, String[][] dataset)
    {
        /* Write your code here */
        return null;
    }

    public static ArrayList<String> booksRating(String[][] dataset, String rating)
    {
        /* Write your code here */
        return null;
    }

    public static String[][] booksAndPrice(String[][] dataset, String author)
    {
        /* Write your code here */
        return null;
    }
}
