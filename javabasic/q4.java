package javabasic;
import java.util.*;
public class q4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=10;i++){
            int res=n*i;
            System.out.println(n+" x "+i+"  = "+res);
        }
        
    }
}
