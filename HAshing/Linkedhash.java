package HAshing;
import java.util.*;
public class Linkedhash {
    public static void main(String args[]){
        LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();
        lhm.put("US",100);
        lhm.put("UAE",50);
        lhm.put("India",60);
        lhm.put("china",70);
        System.out.println(lhm);
        TreeMap<String,Integer>tm=new TreeMap<>();
        tm.put("US",100);
        tm.put("UAE",50);
        tm.put("India",60);
        tm.put("China",70);
        System.out.println(tm);


    }
}
