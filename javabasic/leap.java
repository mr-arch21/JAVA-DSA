package javabasic;
import java.util.*;
public class leap {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        sc.close();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("This is a leap year");
                }else{
                    System.out.println("This is not a leap year");
                }

            }else{
                System.out.println("This is a leap year"); 
            }

        }else{
            System.out.println("This is not a leap year");
        }
    }
}
