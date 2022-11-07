package dynamicprogramming.knapsack;

public class tabu {
    public static void printdp(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int knapSack(int val[],int wt[],int W){
        int n=val.length;
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<dp.length;i++){//oth col
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){//oth row
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                int v=val[i-1];//ith item val
                int w=wt[i-1];//ith item wt
                if(w<=j){
                    //valid
                    int incprofit=v+dp[i-1][j-w];
                    int excprofit=dp[i-1][j];
                    dp[i][j]=Math.max(incprofit,excprofit);
                }else{
                    //invalid
                    int excprofit=dp[i-1][j];
                    dp[i][j]=excprofit;
                }
            }
           
        }
        printdp(dp);
        return dp[n][W];
    }
    
    public static void main(String args[]){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        System.out.print(knapSack(val,wt,W));


    }
}
