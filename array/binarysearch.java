package array;

public class binarysearch {
    public static int bS(int n[],int key){
        int left=0;
        int right=n.length-1;
        while(left<=right){
            int mid =left +(right-left)/2;
            if(key==n[mid]){
                return mid;
            }else if(key<n[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
                
            
        }
        return -1;
        
    }
    public static void main(String args[]){
    int n[]={2,4,6,8,10,32,45,66};
    int key=3;
    System.out.println("the key is found at index:"+bS(n, key));
}}
