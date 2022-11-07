package tdarray;

public class search {
    public static boolean staircase(int nums[][],int key){
        int row=nums.length-1,col=0;
        while(col<nums[0].length&&row>=0){
            if(nums[row][col]==key){
                System.out.println("found at index ("+row+","+col+")");
                return true;
            }
            else if(key<nums[row][col]){
                row--;
            }else{
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void binarySearch(int nums[][],int key){
        int r=0;
        int c=nums[0].length-1;
       
        while(r<nums.length && c>=0){
            if(nums[r][c]==key){
                System.out.print("("+r+","+c+")");

            }
            if(nums[r][c]<key){
                r++;
            }
            else{
                c--;
            }

        }

    }

    public static void main(String args[]){
        int nums[][]={{10,20,30,40},
                      {15,25,35,45},
                      {27,29,37,48},
                      {32,33,39,50}};
        int key=45;
        binarySearch(nums, key);
        staircase(nums, key);
    }
    
}
