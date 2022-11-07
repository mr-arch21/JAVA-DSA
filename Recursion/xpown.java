package Recursion;

public class xpown {
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        return x*pow(x,n-1);
    }
    public static int optimalpow(int x,int n){//O(logn)
        if(n==0){
            return 1;
        }
        int halfpow=optimalpow(x, n/2);
        int halfpowsq=halfpow*halfpow;
        if(n%2!=0){
           halfpowsq=x*halfpowsq; 
        }
        return halfpowsq;
    }
    public static void main(String args[]){
        int x=2,n=10;
        System.out.println(optimalpow(x, n));

    }
}
