package com.ranjan.java;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        char[][] game_board = new char[m][n];

        char c = '-';
		boolean p1Turn = true; 
        //Initialize our board with '-'
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				game_board[i][j] = '-';
			}
		}
        while(true) {
			displayBoard(game_board,m,n);
			c = checkTurn(c, p1Turn);
			move(c,game_board);

			char temp = winner(game_board,m,n);
			if(temp == 'x') {
				displayBoard(game_board,m,n);
				System.out.println("Player1 (x) has won!");
				return;
			} 
			else if(temp == 'o') {
				displayBoard(game_board,m,n);
				System.out.println("Player2 (o) has won!");
				return;
			} 
			else {
				//If player1 is true, make it false, and vice versa; this way, the players alternate each turn
				p1Turn = !p1Turn;
			}
		}
    }

    public static void displayBoard(char[][] game_board,int m,int n) {
		System.out.println("Tic Tac Toe Board");
		/* Write your code for task 2 here */
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(game_board[i][j]+" ");
            }
		    System.out.println();
        }
	}

    public static char checkTurn(char c, boolean p1Turn){
        if(p1Turn) {
            System.out.println("Player1's Turn (x):");
            c = 'x';
        } 
        else {
            System.out.println("Player2's Turn (o):");
            c = 'o';
        }
		return c;
	}

    public static void move(char c, char[][] game_board) {

		//Indexes that correspond to a position on our board
		int row = 0;
		int col = 0;

		while(true) {
				
			Scanner in = new Scanner(System.in);
			System.out.print("Enter a row number (0, 1, or 2): ");
			row = in.nextInt();
			System.out.print("Enter a column number (0, 1, or 2): ");
			col = in.nextInt();
            //Check if the row and col are 0, 1, or 2
			if(row < 0 || col < 0 || row > 2 || col > 2) {
				System.out.println("This position is off the bounds of the board! Try again.");
			}		
			//Check if the position on the board the user entered is empty (has a -) or not
			else if(game_board[row][col] != '-') {
				System.out.println("Someone has already made a move at this position! Try again.");
			}
			//Otherwise, the position is valid so break out of the while loop
			else {
				System.out.println("\nInput is valid!");
				game_board[row][col] = c;	
				System.out.println("\nGame board updated.");
				return;
			}
		}	

	}

    public static char winner(char[][] game_board,int m,int n) {
        //Check all the rows
        for(int i = 0; i < m; i++) {
            if(game_board[i][0] == game_board[i][1] && game_board[i][1] == game_board[i][2] && game_board[i][0] != ' ') {
                return game_board[i][0];
            }
        }
        //Check each column
        for(int j = 0; j < n; j++) {
            if(game_board[0][j] == game_board[1][j] && game_board[1][j] == game_board[2][j] && game_board[0][j] != ' ') {
                return game_board[0][j];
            }
        }
        //Check the diagonals
        if(game_board[0][0] == game_board[1][1] && game_board[1][1] == game_board[2][2] && game_board[0][0] != ' ') {
            return game_board[0][0];
        }
        if(game_board[2][0] == game_board[1][1] && game_board[1][1] ==  game_board[0][2] && game_board[2][0] != ' ') {
            return game_board[2][0];
        }
        return ' ';
    }

    public static boolean tie(char[][] game_board) {
		for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(game_board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
	}
}
