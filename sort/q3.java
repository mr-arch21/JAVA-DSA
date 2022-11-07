package sort;

public class q3 {
    //brute force
    public static int getInvCount(int arr[]){//O(N^N)
        int n=arr.length;
        int invcount=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    invcount++;
                }
            }
        }
        return invcount;
    }
    
    
    //optimized
    public static int merge(int arr[],int left,int mid,int right){
        int i=left,j=mid,k=0;//two pointer
        int invcount=0;
        int temp[]=new int[(right-left+1)];

        while((i<mid)&&(j<=right)){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            }else{
                temp[k]=arr[j];
                invcount+=(mid-i);
                k++;
                j++;
            }
        }
        while(i<mid){
            temp[k]=arr[i];
            k++;
            i++;
        }
        while(j<=right){
            temp[k]=arr[j];
            k++;
            j++;
        }
        for( i=left , k=0;i<=right;i++,k++){
            arr[i]=temp[k];
        }
        return invcount;
    }
    private static int mergeSort(int arr[],int left,int right){
        int invcount=0;
        if(right>left){
            int mid=(right+left)/2;
            invcount=mergeSort(arr, left, mid);
            invcount+=mergeSort(arr, mid+1, right);
            invcount+=merge(arr,left,mid+1,right);
        }
        return invcount;
    }
    public static int getInversion(int arr[]){
        int n=arr.length;
        return mergeSort(arr, 0, n-1);
    }
    
    public static void main(String args[]){
        int arr[]={2,4,1,3,5};
        System.out.println("Inversion Count="+getInversion(arr));
        // System.out.println("Inversion Count="+getInvCount(arr));
    }
}
