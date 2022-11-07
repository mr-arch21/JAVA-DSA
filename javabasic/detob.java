package javabasic;
import java.util.*;

public class detob {
    public static int decitobin(int n){
        int myn=n;
        int binary=0;
        int pow=0;
        while(myn>0){
            int rem=myn%2;
            binary=binary+(rem*(int)Math.pow(10,pow));
            pow++;
            myn=myn/2;


        }
        return binary;
    }
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println(decitobin(n));
        
        }
}
