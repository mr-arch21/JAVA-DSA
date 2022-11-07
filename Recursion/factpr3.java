package Recursion;

public class factpr3 {
    public static int fact(int n){
        if(n==0){
          return 1;
        }
        int faactorial=n*fact(n-1);
        return faactorial;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(fact(n));
    }
}
