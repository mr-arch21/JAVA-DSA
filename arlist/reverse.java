package arlist;
import java.util.*;
public class reverse {
    public static void swap(ArrayList<Integer>l1,int idx,int idx2){
        int temp=l1.get(idx);
        l1.set(idx,l1.get(idx2));
        l1.set(idx2,temp);

    }
    public static void main(String args[]){
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(23);
        l1.add(34);
        l1.add(56);
        l1.add(78);
        l1.add(45);
        System.out.println(l1);
        for(int i=l1.size()-1;i>=0;i--){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();

        //max
        int max=Integer.MIN_VALUE;
        for(int i=0;i<l1.size();i++){
            if(max<l1.get(i)){
                max=l1.get(i);
            }
        }
        System.out.println("max element is "+max);
        System.out.println(l1);
        swap(l1,1,3);
        System.out.println(l1);
    }
    
}
