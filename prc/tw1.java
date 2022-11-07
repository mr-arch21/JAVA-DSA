package prc;
import java.util.*;
public class tw1 {
    public static int trpa(int h[]){
       int  n=h.length;
       int trapwater=0;
        int left[]=new int[n];
        left[0]=h[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],h[i]);
        }

        int right[]=new int[n];
        right[n-1]=h[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],h[i]);
        }

        for(int i=0;i<n;i++){
            int waterlevel=Math.min(left[i],right[i]);
            trapwater+=waterlevel-h[i];
        }
        return trapwater;
    }
    public static int to(int h[]){
        int n=h.length;
        int res=0,l=0,r=n-1,lmax=h[0],rmax=h[n-1];
        while(l<r){
            if(lmax<rmax){
                l++;
                lmax=Math.max(lmax,h[l]);
                res+=lmax-h[l];

            }else{
                r--;
                rmax=Math.max(rmax,h[r]);
                res+=rmax-h[r];
            }
            
        }
        return res;

    }
    public static int buyandsell(int h[]){
        int buy=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<h.length;i++){
            if(buy<h[i]){
                int profit=h[i]-buy;
                maxprofit=Math.max(maxprofit,profit);
            }if(buy>h[i]){
                buy=h[i];
            }
        }
        return maxprofit;
    }
     
    public static void main(String args[]){
        int h[]={4,2,0,3,2,5};
        int trapwater=to(h);
        System.out.println("the total trapped water is:"+trapwater);
        System.out.println("the profit is:"+buyandsell(h));

    }
    
}
