package sort;

public class searchrotated {
    public static int search(int a[],int target){
        int low = 0 , high = a.length -1;
	    int x = -20;
	    while(low <= high){
	        int mid = (low+high)/2;
	        if(a[mid] == target){
	            x = mid;
	            return x;
	        }
	        if(a[low] < a[mid]){
	            if(target >= a[low] && target < a[mid]){
	                high = mid - 1;
	            }else{
	                low = mid + 1;
	            }
	        }else{
	            if(target > a[mid] && target <= a[high]){
	                low = mid + 1;
	            }else{
	                high = mid - 1;
	            } 
	        }
	        
	    }
	    if(x != -20){
	        return x;
	    }
	    
	    return -1;
	}

    public static void main(String args[]){
        int a[]={4,5,6,7,0,1,2};
        int target=6;
        System.out.println(search(a,target));
    }  
} 

//iterative
// class Solution 
// { 
//     static int Search(int array[], int target)
// 	{
// 	    // code here
// 	    int low = 0 , high = array.length -1;
// 	    int x = -20;
// 	    while(low <= high){
// 	        int mid = (low+high)/2;
// 	        if(array[mid] == target){
// 	            x = mid;
// 	            return x;
// 	        }
// 	        if(array[low] < array[mid]){
// 	            if(target >= array[low] && target < array[mid]){
// 	                high = mid - 1;
// 	            }else{
// 	                low = mid + 1;
// 	            }
// 	        }else{
// 	            if(target > array[mid] && target <= array[high]){
// 	                low = mid + 1;
// 	            }else{
// 	                high = mid - 1;
// 	            } 
// 	        }
	        
// 	    }
// 	    if(x != -20){
// 	        return x;
// 	    }
	    
// 	    return -1;
// 	}
// } 


