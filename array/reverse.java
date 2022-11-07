package array;

public class reverse {
    public static void reversearr(int nums[]){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            left++;
            right--;

        }

    }

    public static void main(String args[]){
        int nums[]={2,4,6,8,10};
        reversearr(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println(" ");

    }
}
