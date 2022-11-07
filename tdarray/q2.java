package tdarray;

public class q2 {
    public static int sum(int nums[][]){
        int n=nums.length;
        int m=nums[0].length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if( i==1){
                    sum+=nums[i][j];
                }
            }
            
        }
        return sum;
    }
    public static void main(String args[]){
        int [][]nums={{1,4,9},{11,8,3},{2,2,3}};
        System.out.println("the sum of second row :"+sum(nums));
    }
    
}
