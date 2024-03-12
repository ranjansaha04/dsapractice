package com.ranjan.java;

import java.util.Scanner;

public class GuessRightNumber {
    public static void main(String[] args) {
        int secret_number = (int)(Math.random() * 100 - 0+1) ;   
        System.out.println("The secret number is: "+ secret_number);
        int userGuessNumber = 0;
        whileGame(secret_number, userGuessNumber);
    }

    public static void whileGame(int secretNumber, int userGuessNumber){
        System.out.println("\nYou are playing the game: Guess the Number. \nYou have unlimited attempts to guess the correct number. \n");
        while(true){
            userGuessNumber = takeInput(userGuessNumber);           
            if (userGuessNumber < secretNumber){
                System.out.println("Your guessed number is smaller.");}
            else if (userGuessNumber > secretNumber){
                System.out.println("Your guessed number is greater.");}
            else{
                System.out.println("Yayy, you won!");
                return;
            }            
        }
    }

    public static void forGame(int secretNumber, int userGuessNumber){
        System.out.println("\nYou are playing the game: Guess the Number. \nYou have maximum 5 attempts to guess the correct number. \n");
       for(int attempt = 0; attempt < 5; attempt++){
            
            //giving user a warning before their last attempt
            if (attempt == 4)
            {
                System.out.println("\nWatch out, it's your last turn.");
            }
            userGuessNumber = takeInput(userGuessNumber);
           
            if (userGuessNumber < secretNumber){
                System.out.println("Your guessed number is smaller.");}
            else if (userGuessNumber > secretNumber){
                System.out.println("Your guessed number is greater.");}
            else{
                System.out.println("Yay, you won!");
                return;
            }            
        }
    }

    public static int takeInput(int guess){
    //.......................Taking input....................
    Scanner userInput = new Scanner(System.in);
    //check for valid input and take input
    System.out.print("Enter a number between 0 to 100\n");
    if(userInput.hasNextInt()) {
        guess = userInput.nextInt(); 
    }else {
        System.out.println("Enter a valid integer number between 0 and 100");
    }      
    return guess; 
    //.........................................................
    }
}
