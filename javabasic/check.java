package javabasic;
import java.util.*;
public class check {
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    sc.close();
    if(number>=0){
        System.out.println(number+" is positive");
    }
    else{
        System.out.println(number+" is negative");
    }
 }   
}
