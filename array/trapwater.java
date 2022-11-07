package array;

public class trapwater {   
     public static int trap(int n[]){
       int h=n.length;
        int res=0,l=0,r=h-1;
        int rmax=n[r],lmax=n[l];
        while(l<r){
            if(lmax<rmax){
                l++;
                lmax=Math.max(lmax,n[l]);
                res+=lmax-n[l];
            }else{
                r--;
                rmax=Math.max(rmax,n[r]);
                res+=rmax-n[r];
            }
        }
        return res;

     }
    public static void main(String args[]){
        int n[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("total water trap is: "+trap(n));
    }
}
