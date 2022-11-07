package HAshing;
import java.util.* ;
public class intro {
    public static void main(String args[]){
        HashMap<String,Integer>hm=new HashMap<>();
        //Insert
        hm.put("US",100);
        hm.put("UAE",50);
        hm.put("India",60);
        hm.put("china",70);
        System.out.println(hm);
        //get-O(1)
        int population=hm.get("India");
        System.out.println(population);
        //containskey
        System.out.println(hm.containsKey("India"));
        //remove
        System.out.println(hm.remove("china"));
        //size
        System.out.println(hm.size());
        //isEmpty
        System.out.println(hm.isEmpty());
        //iteration
        Set<String>keys=hm.keySet();
        System.out.println(keys);
        for(String K:keys){
            System.out.println("key="+K+",value="+hm.get(K));
        }
    }
}
