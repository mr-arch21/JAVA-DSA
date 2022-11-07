package prc;
import java.util.*;
public class tw {
    public static int trw(int h[]){
        int left[]=new int[h.length];
        left[0]=h[0];
        int trap=0;
        for(int i=1;i<h.length;i++){
            left[i]=Math.max(left[i-1], h[i]);
        }

        int right[]=new int[h.length];
        right[h.length-1]=h[h.length-1];
        for(int i=h.length-2;i>=0;i--){
            right[i]=Math.max(h[i],right[i+1]);
        }

        for(int i=0;i<h.length;i++){
            int waterlevel=Math.min(left[i],right[i]);
            trap+=waterlevel-h[i];
        }
        return trap;
    }
    public static int trappani(int h[]){
        int l=0,r=h.length-1;
        int res=0;
        int lmax=h[l],rmax=h[r];
        while(l<r){
            if(lmax<rmax){
                l++;
                lmax=Math.max(lmax, h[l]);
                res+=lmax-h[l];

            }else{
                r--;
                rmax=Math.max(rmax,h[l]);
                res+=rmax-h[l];
            }
        }
        return res;
    }
    public static void main(String args[]){
        int h[]={4,2,0,3,2,5};
        int trapwater=trappani(h);
        System.out.println("the total trapped water is:"+trapwater);

    }
    
}
