package arlist;
import java.util.*;
public class im {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        //add-O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //get
        int elem=list.get(2);
        System.out.println(elem);

        //delete
        list.remove(2);
        System.out.println(list);

        //set
        list.set(2,10);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        //size
        System.out.println(list.size());//method

        //print
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
