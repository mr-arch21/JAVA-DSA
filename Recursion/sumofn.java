package Recursion;

public class sumofn {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int s=n+sum(n-1);
        return s;
    }
    public static void main(String args[]){
        int n=10;
        System.out.println(sum(n));
    }
}
