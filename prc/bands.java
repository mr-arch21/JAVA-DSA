package prc;

import java.util.*;

public class bands {
    public static void buyandsells(int p[]){
        int buy=p[0];
        int maxprofit=0;
        int profit=0;
        for(int i=0;i<p.length;i++){
            if(buy<p[i]){
                profit=p[i]-buy;
            }else{
                buy=p[i];
            }
            maxprofit=Math.max(profit, maxprofit);
        }
        System.out.println("max profit : "+maxprofit);
    }

    public  static void main(String args[]){
        int p[]={7,1,5,3,6,4};
        buyandsells(p);
    }
    
}
