package greedy;

public class q2 {
    public static int kthOdd(int range[],int k){
        if(k<=0){
            return 0;
        }
        int L=range[0];
        int R=range[1];
        if((R&1)>0){
            int Count=(int)Math.ceil((R-L+1)/2);
            if(k>Count){
                return 0;
            }
            else{
                return(R-2*k+2);
            }
        }else{
            int Count=(R-L+1)/2;
            if(k>Count){
                return 0;
            }
            else{
                return(R-2*k+1);
            }
        }
    }
    public static void main(String args[]){
        int []p={-10,10};
        int k=8;
        System.out.println(kthOdd(p,k));
    }
}
