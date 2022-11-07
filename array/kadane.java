package array;
import java.util.*;
public class kadane {
    public static void kadanes(int n[]){
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            cursum+=n[i];
            if(cursum<0){
                cursum=0;
            }
            maxsum=Math.max(cursum,maxsum);

        }
        System.out.println("our maximum:"+maxsum);
    }
    public static void main(String args[]){
        int n[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(n);
    }
    
}
