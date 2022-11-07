package Recursion;

public class friendpair {
    public static int friendpairs(int n){
        if(n==1||n==2){
            return n;
        }
        
        //single
        int fnm1=friendpairs(n-1);
        //pair
        int fnm2=friendpairs(n-2);
        int pairways=(n-1)*fnm2;
        //total ways
        int totalways=pairways+fnm1;
        return totalways;
    }
    public static void main(String args[]){
        System.out.println(friendpairs(3));
    }
}
