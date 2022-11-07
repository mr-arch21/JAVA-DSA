package sort;

public class mergesort {
    public static void printarr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void MergSort(int a[],int si,int ei){
        if(si>=ei){
            return;
        }
        //kaam
        int mid=si+(ei-si)/2;
        MergSort(a, si, mid);
        MergSort(a, mid+1, ei);
        merge(a,si,mid,ei);
    }
    public static void merge(int a[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;//iterator for left
        int j=mid+1;//iterator for right
        int k=0;//iterator for temp
        while(i<=mid && j<=ei){
            if(a[i]<a[j]){
                temp[k]=a[i];
                i++;
            }
            else{
                temp[k]=a[j];
                j++;
            }
            k++;
        }
        //left part jo bache hue element
        while(i<=mid){
            temp[k++]=a[i++];
        }
        //rigth part
        while(j<=ei){
            temp[k++]=a[j++];
        }
        //copy temp to original
        for( k=0,i=si;k<temp.length;i++,k++){
            a[i]=temp[k];
        }
    }
    public static void main(String args[]){
        int a[]={6,3,9,5,2,8};
        MergSort(a, 0, a.length-1);
        printarr(a);

    }
}
