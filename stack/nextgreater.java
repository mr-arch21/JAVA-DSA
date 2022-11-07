package stack;
import java.util.*;
public class nextgreater {
    public static void main(String args[]){
        int arr[]={7,9,2,4,10};
        Stack<Integer>s=new Stack<>();
        int nxtgrter[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            //step 1
            while(!s.isEmpty()&& arr[s.peek()]<=arr[i]){//s.peek return index
                s.pop();
            }
            //step 2
            if(s.isEmpty()){
                nxtgrter[i]=-1;
            }else{
                nxtgrter[i]=arr[s.peek()];
            }
            //step 3
            s.push(i);
        }
        for(int i=0;i<nxtgrter.length;i++){
            System.out.print(nxtgrter[i]+" ");
        }
        System.out.println();
    }
}
