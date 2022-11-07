package prc;

public class searchintwod {
    public static boolean search(int nums[][],int key){
        int n=nums.length;
        int row=n-1,col=0;
        while(col<n&&row>=0){
            if(nums[row][col]==key){
                System.out.println("("+row+","+col+")");
                return true;
            }else if(nums[row][col]<key){
                col++;
            }else{
                row--;
            }

        }
        return false;
    }

    public static void spiral(int nums[][]){
        int startrow=0,startcol=0,endrow=nums.length-1,endcol=nums[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int j=startcol;j<=endcol;j++){
                System.out.print(nums[startrow][j]+" ");
            }
            //right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(nums[i][endcol]+" ");
            }
            //bottom
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(nums[endrow][j]+" ");
            }
            //lefft
            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(nums[i][startcol]+" ");
            }
            startrow++;
            endcol--;
            endrow--;
            startcol++;
        }
    }

    public static void main(String args[]){
        int nums[][]={{10,20,30,40},
                      {15,25,35,45},
                      {27,29,37,48},
                      {32,33,39,50}};
        int key=39;
        System.out.println(search(nums, key));
        spiral(nums);
    }   
}
