package javabasic;
import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        sc.close();
        
        for(int i=2 ;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
            
        }
        if(isPrime==true){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is a composite number");
        }

    }
}
