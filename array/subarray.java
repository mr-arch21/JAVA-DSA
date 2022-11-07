package array;

public class subarray {
    public static void subA(int n[]){
        int ts=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        
        for(int i=0;i<n.length;i++){
            for(int j=i;j<n.length;j++){
                
                int sum=0;
                for(int k=i;k<=j;k++){
                    
                    System.out.print(n[k]+" ");
                    sum+=n[k];
                    maxsum=Math.max(sum,maxsum);
                    minsum=Math.min(sum,minsum);
                    
                    
                }
                ts++;
                System.out.print("the sum :"+sum);
                
                
                
                System.out.println();
            
            }
            System.out.println();
        }
        System.out.println("total subarray:"+ts);
        System.out.println("the max sum :"+maxsum);
        System.out.print("the min sum :"+minsum);
    }

    public static void main(String args[]){
        int n[]={2,4,6,8,10};
        subA(n);
    }
}
