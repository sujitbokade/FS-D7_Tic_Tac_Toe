package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {

    static char[] board = new char[10];
    static Scanner sc = new Scanner(System.in);
    static int position;
    static char player;
    static char computer;
    static char currentPlayerLetter;

    static void createBoard(char[] board) {
        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }
    }

    static void chooseLetter() {
        System.out.println("Choose any Letter (x,o)");
        player = sc.next().charAt(0);
        computer = (player == 'x') ? 'o' : 'x';
        System.out.println("Your Letter is " + player);
        System.out.println("Computer Letter is " + computer);

    }

    static void showBoard(char[] board) {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }

    static void makeMove(char[] board, char currentPlayer, int position) {
        char symbol = ' ';
        if (currentPlayer == player) {
            symbol = player;
        } else if (currentPlayer == computer) {
            symbol = computer;
        }
        switch (position) {
            case 1:
                if (board[1] == ' ') {
                    board[1] = symbol;
                } else {
                    System.out.println(position + "is Invalid Position");
                }
                break;
            case 2:
                if (board[2] == ' ')
                    board[2] = symbol;
                else {
                    System.out.println(position + "is Invalid Position");
                }
                break;
            case 3:
                if (board[3] == ' ')
                    board[3] = symbol;
                else {
                    System.out.println(position + "is Invalid Position");
                }
                break;
            case 4:
                if (board[4] == ' ')
                    board[4] = symbol;
                else {
                    System.out.println(position + "is Invalid Position");
                }
                break;
            case 5:
                if (board[5] == ' ')
                    board[5] = symbol;
                else {
                    System.out.println(position + "is Invalid Position");
                }
                break;
            case 6:
                if (board[6] == ' ')
                    board[6] = symbol;
                else {
                    System.out.println(position + "is Invalid Position");
                }
                break;
            case 7:
                if (board[7] == ' ')
                    board[7] = symbol;
                else {
                    System.out.println(position + "is Invalid Position");
                }
                break;
            case 8:
                if (board[8] == ' ')
                    board[8] = symbol;
                else {
                    System.out.println(position + "is Invalid Position");
                }
                break;
            case 9:
                if (board[9] == ' ')
                    board[9] = symbol;
                else {
                    System.out.println(position + "is Invalid Position");
                }
                break;
            default:
                break;
        }
        showBoard(board);


    }

    public static void main(String[] args) {
        createBoard(board);
        chooseLetter();
        showBoard(board);
        while (true) {
            System.out.println("Your Turn,Choose in between 1 to 9");
            int playerposition = sc.nextInt();
            makeMove(board, player, playerposition);
            System.out.println("Computer Turn :");
            int computerposition = (int) (Math.random() * 10) % 10 + 1;
            makeMove(board, computer, computerposition);

        }
    }
}