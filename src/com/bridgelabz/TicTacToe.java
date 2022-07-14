package com.bridgelabz;

public class TicTacToe {

    static char[] board =new char[10];
    static void createBoard(char[]board){
        for(int i=1;i<10;i++){
            board[i]=' ';
        }
    }
    public static void main(String[] args) {
        createBoard(board);
    }
}
