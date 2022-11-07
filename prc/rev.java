package prc;

public class rev {
    public static void reverse(int nums[]){
        int s=0;
        int l=nums.length-1;
        while(s<l){
            int temp=nums[s];
            nums[s]=nums[l];
            nums[l]=temp;
            s++;
            l--;
        }
        
    }

    public static void main(String args[]){
        int nums[]={2,4,6,8,9,10};
        reverse(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
       
    }
    
}
