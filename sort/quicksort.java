package sort;

public class quicksort {
    public static void printarr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void QuicSort(int []a,int si,int ei){
        if(si>=ei){
            return;
        }
        int Pidx=Partition(a,si,ei);
        QuicSort(a, si, Pidx-1);
        QuicSort(a, Pidx+1, ei);
    }
    public static int Partition(int a[],int si,int ei){
        int pivot=a[ei];
        int i=si-1;//to make place for element smaller than pivot
        for(int j=si;j<ei;j++){
            if(a[j]<=pivot){
                i++;
                //swap
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
                
            }
        }
        i++;
        int temp=pivot;
        a[ei]=a[i];
        a[i]=temp;
        return i;


    }
    public static void main(String args[]){
        int a[]={6,3,9,5,2,8};
        QuicSort(a, 0, a.length-1);
        printarr(a);

    }
}
