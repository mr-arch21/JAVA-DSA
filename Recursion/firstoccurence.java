package Recursion;

public class firstoccurence {
    public static int fo(int a[],int e,int i){
        if(i==a.length){
            return -1;
        }
        if(a[i]==e){
            return i;
        }
        return fo(a,e,i+1);
    }
    public static int lo(int a[],int e,int i){
        if(i==a.length){
            return -1;
        }
        int isfound=lo(a, e, i+1);
        if(isfound==-1&&a[i]==e){
            return i;
        }
        return isfound;
    }
    public static void main(String args[]){
        int a[]={11,44,55,44,55};
        int e=55;
        int i=0;
        System.out.println(fo(a, e, i));
        System.out.println(lo(a, e, i));

    }
}
