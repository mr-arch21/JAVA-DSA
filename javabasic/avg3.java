package javabasic;
import java.util.*;
public class avg3 {
    public static int average3(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        System.out.println(average3(a,b,c));

    }
}
