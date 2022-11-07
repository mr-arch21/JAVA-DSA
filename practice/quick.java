package practice;

public class quick {
    public static void print(int n[]){
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
    public static void quicksort(int n[],int si,int ei){
        //base
        if(si>=ei){
            return;
        }
        //kaam
        int pidx=partition(n,si,ei);
        quicksort(n, si,pidx-1);
        quicksort(n, pidx+1, ei);
    }
    public static int partition(int n[],int si,int ei){
        int pivot=n[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(n[j]<=pivot){
                i++;
                int temp=n[j];
                n[j]=n[i];
                n[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        n[ei]=n[i];
        n[i]=temp;
        return i;
    }
    public static void main(String args[]){
        int n[]={3,8,2,5,7,6,23,11};
        quicksort(n,0,n.length-1);
        print(n);

    }
}
