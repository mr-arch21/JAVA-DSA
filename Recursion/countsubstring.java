package Recursion;

public class countsubstring {
    public static int csub(String a,int i,int j,int n){
            if(n==1){
                return 1;
            }
            if(n<=0){
                return 0;
            }
            int res=csub(a,i+1,j,n-1)+csub(a,i,j-1,n-1)-csub(a, i+1, j-1, n-2);
            if(a.charAt(i)==a.charAt(j)){
                res++;
            }
          return res;
    
        }

    public static void main(String args[]){
        String a="abcab";
        int n=a.length();
        System.out.print(csub(a,0,n-1,n));
    }
    
}
