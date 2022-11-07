package javabasic;
import java.util.*;
public class q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num,choice,sume=0,sumo=0;
        do{
            System.out.print("enter the number:");
            num=sc.nextInt();
            if(num % 2==0){
                sume+=num;
            }
            else{
                sumo+=num;
            }
            System.out.print(" press 1 for continue and press 0 for break");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println("sum of odd numbers "+sumo );
        System.out.println("sum of even numbers "+sume );
        sc.close();
}
}