package dynamicprogramming.knapsack;
// O(2^N)
public class rec {
    public static int knapSack(int val[],int wt[],int W,int n){
        if(W==0||n==0){
            return 0;
        }
        if(wt[n-1]<=W){//valid
            //include
            int ans=val[n-1]+knapSack(val, wt, W-wt[n-1], n-1);
            //exclude
            int ans2=knapSack(val, wt, W, n-1);
            return Math.max(ans,ans2);

        }else{//not valid
            return knapSack(val, wt, W, n-1);

        }
    }
    public static void main(String args[]){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        System.out.print(knapSack(val,wt,W,val.length));


    }
}
