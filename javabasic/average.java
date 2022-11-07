package javabasic;
import java.util.*;
public class average {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
      
        float a=sc.nextFloat();  
        float b=sc.nextFloat();  
        float c=sc.nextFloat(); 
        float average=(a+b+c)/3;
        sc.close();
        System.out.println(average) ;
    }
}
