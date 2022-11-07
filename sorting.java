public class sorting {
    public static void bubblesort(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            int swap=0;
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]<=nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    swap++;
                    

                    
                }
                
                
            }
        }
        
        }
    public static void selectionsort(int nums[]){
        //km swap hote as comparison bubble sort
        for(int i=0;i<nums.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minpos]<nums[j]){
                    minpos=j;
                }
            }
            int temp=nums[minpos];
            nums[minpos]=nums[i];
            nums[i]=temp;
        }
    }
    public static void insertionsort(int nums[]){
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            int prev=i-1;
            while(prev>=0 && nums[prev]<curr){
                nums[prev+1]=nums[prev];
                prev--;
            }
            nums[prev+1]=curr;
        }

    }
    public static void countingSort(int nums[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            largest=Math.max(largest, nums[i]);
        
        }
        int count[]=new int[largest+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        //sorting
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                nums[j]=i;
                j++;
                count[i]--;

            }   
        }
    }
    
    public static void main(String args[]){
    int nums[]={3,6,2,1,8,7,4,5,3,1};
    // int nums[]={4,3,2,1};
    // bubblesort(nums);
    // selectionsort(nums);
    // insertionsort(nums);
    countingSort(nums);

    for(int k=0;k<nums.length;k++){
        System.out.print(nums[k]+" ");
    }
}
}
