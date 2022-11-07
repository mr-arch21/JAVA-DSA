package Recursion;

public class tiling {
    public static int tilingways(int n){//2xn (floor size)
       //base case
        if(n==0||n==1){
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1=tilingways(n-1);
        //horizontal choice
        int fnm2=tilingways(n-2);

        int totalways=fnm1+fnm2;
        return totalways;

    }
    public static void main(String args[]){
        System.out.println(tilingways(3));

    }
}
