package javabasic;
import java.util.*;

public class bitod {
    public static int bintodec(int n){
        int myn=n;
        int pow=0;
        int  decimal=0;
        while(myn>0){
           int rem= myn%10;
            decimal=decimal+(rem*(int)Math.pow(2,pow));
            pow++;
            myn=myn/10;
        }
        return decimal;
    }
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println("decimal of "+n+" is "+bintodec(n));
        }
}
