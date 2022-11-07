package HAshing;
import java.util.*;
public class iternaryfromticket {
    public static String getStart(HashMap<String,String>tickets){
        HashMap<String,String>revmap=new HashMap<>();
        for(String key:tickets.keySet()){
            revmap.put(tickets.get(key),key);
        }
        for(String key:tickets.keySet()){
            if(!revmap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String args[]){
        HashMap<String,String>tickets=new HashMap<>();
        tickets.put("chennai","banglore");
        tickets.put("mumbai","delhi");
        tickets.put("goa","chennai");
        tickets.put("delhi","goa");
        String start=getStart(tickets);
        System.out.print(start);
        for(String key:tickets.keySet()){
            System.out.print("->"+tickets.get(start));
            start=tickets.get(start);
        }
        System.out.println();
    }
}
