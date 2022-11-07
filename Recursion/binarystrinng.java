package Recursion;

public class binarystrinng {
    public static void prbis(int n,int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        prbis(n-1,0,str+"0");
        if(lastPlace==0){
            prbis(n-1,1,str+1);
        }
    }
    public static void main(String args[]){
        prbis(3,0,"");
    }
}
