package com.advanced.dsa.algos.backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n=4;
        char[][] board =new char[n][n];
        //Initialize the board with x
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='X';
            }
        }
        solve(board,0,n);
    }
    //Function to check if it safe to place a queen
    public static boolean isSafe(char[][] board,int row ,int col,int n){
        //check the column
        for (int i = 0; i < row; i++) {
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //Check left diagonal
        for (int i = row-1, j =col-1 ; i>=0 && j>=0 ;i--,j--) {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for (int i = row-1, j =col+1 ; i>=0 && j<n ;i--,j++) {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    //BackTracking Function
    static void solve(char[][] board,int row,int n){
        //Base case: if all queens have been placed
        if(row==n){
            printBoard(board,n);
            System.out.println();
            return;
        }
        //Try placing the queen in every row
        for (int col = 0; col < n; col++) {
            if(isSafe(board,row,col,n)){
                board[row][col]='Q';
                solve(board,row+1,n);//recursive call for next row
                board[row][col]='X';//BackTracking
            }
        }

    }
    static void printBoard(char[][] board,int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
