package arlist;
import java.util.*;

public class sort {
    public static void main(String args[]){
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(93);
        l1.add(34);
        l1.add(76);
        l1.add(28);
        l1.add(45);
        System.out.println(l1);
        Collections.sort(l1);//ascending
        System.out.println(l1);
        //descending
        Collections.sort(l1,Collections.reverseOrder());//comparator ek aisa funxn hota jo sorting ka logic define krta h
        System.out.println(l1);

    }    
    
}
