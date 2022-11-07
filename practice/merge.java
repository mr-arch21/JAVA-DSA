package practice;

public class merge {
    public static void mergesort(int n[],int si,int ei){
        if(si>=ei){
            return;
        }
        
        //kaam
        int mid=si+(ei-si)/2;
        mergesort(n, si, mid);
        mergesort(n, mid+1, ei);
        merger(n,si,mid,ei);
    }
    public static void merger(int n[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si,j=mid+1,k=0;
        while(i<=mid&&j<=ei){
            if(n[i]<n[j]){
                temp[k]=n[i];
                i++;
            }else{
                temp[k]=n[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=n[i++];
        }
        while(j<=ei){
            temp[k++]=n[j++];
        }
        for(i=si,k=0;k<temp.length;i++,k++){
            n[i]=temp[k];
        }

    }
    public static void print(int n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
    public static void main(String args[]){
        int n[]={3,8,2,5,7,6,23,11};
        mergesort(n, 0,n.length-1);
        print(n);

    }
}
