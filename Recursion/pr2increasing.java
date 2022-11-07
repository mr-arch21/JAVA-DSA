package Recursion;

public class pr2increasing {
    public static void ascending(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        ascending(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        int n=10;
        ascending(n);
    }
}
