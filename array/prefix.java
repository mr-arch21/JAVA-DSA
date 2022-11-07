package array;

public class prefix {
    public static void presum(int n[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int psum[]=new int[n.length];
        psum[0]=n[0];
        for(int i=1;i<psum.length;i++){
            psum[i]=psum[i-1]+n[i];
        }
        for(int i=0;i<n.length;i++){
            for(int j=i;j<n.length;j++){
                currsum=i ==0?psum[j]:psum[j]-psum[i-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }

            }
        }
        System.out.println("maxsum = "+maxsum);

    }
    public static void main(String args[]){
        int n[]={1,-2,6,-1,3};
        presum(n);
    }
    
}
