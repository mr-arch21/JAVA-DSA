package javabasic;
import java.util.*;
public class q3 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int factorial=1;
        // if( n==0){
            
        //     System.out.println("factorial of 0 is 1");
        // }
        sc.close();
        for(int i=n;i>0;i--){
            factorial =factorial*i;
        }
        System.out.println("factorial of "+n+" is "+ factorial);

    }
}
