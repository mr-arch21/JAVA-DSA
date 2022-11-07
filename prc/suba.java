package prc;

public class suba {
    public static void sub(int n[]){
        int tp=0;
        for(int i=0;i<n.length;i++){
            for(int j=i;j<n.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(n[k]+" ");
                    
                }
                tp++;
               System.out.println(); 
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void main(String args[]){
        int n[]={1,3,4,5,6};
        sub(n);
    }
    
}
