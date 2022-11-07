package javabasic;
import java.util.Scanner;

public class isEv {
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(isEven(n)){
        System.out.println("num is even");
        }else{
            System.out.println("num is odd"); 
        }
    }
    
}
