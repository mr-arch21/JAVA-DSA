package prc;
import java.util.*;

public class maxsub {
    public static void mas(int n[]){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n.length;i++){
            for(int j=i;j<n.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(n[k]+" ");
                    sum+=n[k];
                    max=Math.max(sum,max);
                }
                System.out.print("the sum:"+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("the max sum is:"+max);
    }
    public static void prefSum(int n[]){
        int maxsum=Integer.MIN_VALUE;
        int ps[]=new int[n.length];
        ps[0]=n[0];
        for(int i=1;i<ps.length;i++){
            ps[i]=ps[i-1]+n[i];
        }
        for(int i=1;i<n.length;i++){
            for(int j=i;j<n.length;j++){
                int sum=0;
                sum=ps[i-1]+n[j];
                maxsum=Math.max(sum, maxsum);
                
            }
        }
        System.out.println("max sum is:"+maxsum);
    }
    public static void kadane(int n[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<n.length;i++){
            cs+=n[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println(ms);

    }

    public static void main(String args[]){
        int n[]={1,-2,6,-1,3};
        mas(n);
        prefSum(n);
        kadane(n);
    }
    
}
