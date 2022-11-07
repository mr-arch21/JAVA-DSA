package tdarray;

public class q1 {
    public static int countno(int [][]array){
        int count=0;
        int m=array.length;
        int n=array[0].length;
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                System.out.print(array[i][j]+" , ");
                if(array[i][j]==7){
                    count=count+1 ;
                    
                }
                
            }
        
    
        }
        return count;

    }


    public static void main (String args[]){
        int [][]array={{4,7,8},{7,7,7}};
        System.out.println("the number of 7 is present : "+countno(array));
    }
    
}
