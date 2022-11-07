package Recursion;

public class problem1 {
    public static void printnum(int n){
       
     if(n==1){
        System.out.println(n);
        return;
     }
     System.out.print(n+" ");
     printnum(n-1);

    }
    public static void main(String args[]){
        int n=10;
        printnum(n);
    }
}
