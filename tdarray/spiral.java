package tdarray;

public class spiral {
    /**
     * @param nums
     */
    public static void spirals(int nums[][]){
        int n=nums.length;
        int m=nums[0].length;
        int sr=0,sc=0,er=n-1,ec=m-1;
        while(sr<=sc&&er<=ec){
            //top
            for(int j=sc;j<=ec;j++){
                System.out.print(nums[sr][j]+" ");
            }
            //right
            for(int i=sr+1;i<=er;i++){
                System.out.print(nums[i][ec]+" ");
            }
            //bottom
            for(int j=ec-1;j>=sc;j--){
                if(sr==er){//top ki bottom me na print ho
                    break;
                }
                System.out.print(nums[er][j]+" ");
            }
            // left
            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec){//right ki chz left me na print ho
                    break;
                }
                System.out.print(nums[i][sc]+" ");
            }
            sc++;
            sr++;
            ec--;
            er--;
        }

    }
    public static void main (String args[]){
        int nums[][]={{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};
        spirals(nums);
    }
    
}
