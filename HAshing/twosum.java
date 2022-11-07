package HAshing;
import java.util.*;
public class twosum {
   public static int[] twos(int[] arr,int target){
    int result[]=new int[2];
    HashMap<Integer,Integer>map=new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
        if (map.containsKey(target - arr[i])) {
            result[1] = i;
            result[0] = map.get(target - arr[i]);
            return result;
        }
        map.put(arr[i], i);
    }
    return result;
   }
   public static void main(String args[]){
    int arr[]={3,2,4};
    int target=6;
   int ans[]=twos(arr,target);
   System.out.println(ans);
   } 
}

