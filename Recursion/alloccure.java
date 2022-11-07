package Recursion;

public class alloccure {
    public static void allo(int a[],int key,int i){
        if(i==a.length){
            // System.out.println("key is not found");
            return;

        }
        if(key==a[i]){
            System.out.print(i+" ");
        }
        allo(a, key, i+1);
    }
    public static void main(String args[]){
        int a[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        allo(a, key, 0);
        System.out.println();
    }
}
