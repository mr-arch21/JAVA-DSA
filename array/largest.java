package array;
import java.util.*;
public class largest {
    public static int maxelem(int nums[]){
        int max=Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("the smallest element is:"+min);
        return max;
    }
    public static void main(String args[]){
        int nums[]={3,4,2,54,65,21,67,1};
        System.out.println("the largest element:"+maxelem(nums));
    }
}
