package Backtracking;

public class nqprint1 {
    static int count=0;
    public static boolean isSafe(char board[][],int row,int col){//O(n!)
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean nRani(char board[][],int row){
        //base case
        if(row==board.length){
            count++;
            return true;
        }
        //recursion column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
            board[row][j]='Q';
            if(nRani(board, row+1)){
                return true;
            }//fn call
            board[row][j]='x';//backtracking
            }
        }
        return false;
    }
    public static void printboard(char board[][]){
        System.out.println("-----chess board-----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

        int n=5;
        char board[][]=new char[n][n];
        //initialise
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        if(nRani(board,0)){
            System.out.println("solution is possible");
            printboard(board);
        }else{
            System.out.println("solution is not possible");
        }
    }
}
