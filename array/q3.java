package array;

public class q3 {
    public static int buyandsell(int prices[]){
        int buy=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>buy){
               int profit=prices[i]-buy;
               maxprofit=Math.max(profit, maxprofit);
            }else{
                buy=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int prices[]={7,6,4,3,1};
        System.out.println("max profit is : "+buyandsell(prices));
    }
}
