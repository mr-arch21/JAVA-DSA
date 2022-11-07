package Bitmanipulation;

public class basicoperation {
    public static int getibit(int n,int i){
        int bitmask=1<<i;
        if ((bitmask&n)!=0){
            return 1;
        }
        return 0;

    }
    public static int setibit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int clearibit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static int updateibit(int n,int i,int newBit){
        // if(newBit==0){  basic method
        //     return clearibit(n, i);
        // }else{
        //     return setibit(n, i);
        // }/\

    //another method
    n=clearibit(n, i);
    int Bitmask=newBit<<i;
    return n|Bitmask;
    }

    public static int clearlastibits(int n,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }
    public static int clearRangeofbits(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return bitmask&n;
    }
    public static void main(String args[]){
        int n=10;int i=2;
        System.out.println(getibit(n,i));
        System.out.println(setibit(4,1));
        System.out.println(clearibit(10,1));
        System.out.println(updateibit(10,2,1));
        System.out.println(clearlastibits(15,2));
        System.out.println(clearRangeofbits(10,2,4));
    }
}
