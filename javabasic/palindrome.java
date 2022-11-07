package javabasic;
import java.util.Scanner;

public class palindrome {
    public static boolean ispal(int n){
        int temp=n;
        int reverse=0;
        while(n>0){
        int rem=n%10;
        reverse=reverse*10+rem;
        n=n/10;
        }
        if(temp==reverse){
            return true;
        }else{
        return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        System.out.println(ispal(n));

    }
    
}
