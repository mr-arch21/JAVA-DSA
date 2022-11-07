package Bitmanipulation;

public class oddoreven {
    public static void check(int n){
        if((n&1)!=0){
            System.out.println("the number is odd");
        }
        else{
            System.out.println("the number is even");
        }
    }
    public static void main(String args[]){
        int n=46;
        check(n);
    }
}
