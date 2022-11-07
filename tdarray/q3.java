package tdarray;

public class q3 {
    // public static void transpose(int nums[][]){
    //     int n=nums.length;
    //     int m=nums[0].length;
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<m;j++){
    //             int temp=nums[i][j];
    //             nums[i][j]=nums[j][i];
    //             nums[j][i]=temp;
    //         }
    //     }
    // }

    public static void main(String args[]){
        int nums[][]={{11,12,13},{21,22,23}};
        int n=nums.length;
        int m=nums[0].length;

        printmatrix(nums);

        int trp[][]=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                trp[j][i]=nums[i][j];
            }
        }

        printmatrix(trp);
    
       
    }

    public static void printmatrix(int [][]nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j]+"  ");
            }
            System.out.println();
        }
    } 
}
