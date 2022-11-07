package Bitmanipulation;

public class countset {
    public static int countsetbits(int n){//o(logn)
        int count=0;
        while(n>0){
            if((n&1)!=0){//check for lsb
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void  main(String args[]){
        System.out.println(countsetbits(15));
    }
    
}
