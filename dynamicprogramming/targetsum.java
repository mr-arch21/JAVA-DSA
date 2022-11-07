package dynamicprogramming;

public class targetsum {
    public static void printdp(boolean dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static boolean targetsumtabulation(int nums[],int targetsum){
        int n=nums.length;
        boolean dp[][]=new boolean[n+1][targetsum+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<targetsum+1;j++){
                int v=nums[i-1];
                //include
                if(v<=j&&dp[i-1][j-v]==true){
                    dp[i][j]=true;
                }
                //exclude
                else if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
            }
        }
        printdp(dp);
        return dp[n][targetsum];

    }
   public static void main(String args[]){
    int nums[]={4,2,7,1,3};
     int targetsum=10;
     System.out.println(targetsumtabulation(nums,targetsum));
   } 
}
