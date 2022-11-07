public class a1 {
    public static void less(int arr[],int n){
        int count=0;
        int i=0;
        if(i==0){
            System.out.print("-1"+" ");
        }
        for( i=1;i<n;i++){
           
            if(arr[i-1]<arr[i]){
                count++;
                System.out.print(count+" ");
            }
            else{
                System.out.print("-1"+" ");
            }
        }
    }

    public static void main (String args[]){
        int n=5;
        int arr[]={1,2,3,4,5};
        less(arr, n);
    }
}
