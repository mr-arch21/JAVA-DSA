package HAshing;
import java.util.*;
public class set {
   public static void main(String args[]){
    HashSet<Integer>s=new HashSet<>();
    s.add(1);
    s.add(5);
    s.add(4);
    s.add(7);
    // System.out.println(s);
    //1st way to iterate
    Iterator it=s.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }
    HashSet<String>cities=new HashSet<>();
    cities.add("goa");
    cities.add("punjab");
    cities.add("delhi");
    cities.add("kanpur");
    //2nd way to iterate
    for(String city:cities){
        System.out.println(city);
    }
    //linked hashset=ordered;
    LinkedHashSet<String>lhs=new LinkedHashSet<>();
    System.out.println("----linkedhashset---");
    lhs.add("goa");
    lhs.add("punjab");
    lhs.add("delhi");
    lhs.add("kanpur");
    for(String k:lhs){
        System.out.println(k);
    }
    //tree set--o(logn)
    TreeSet<String>ts=new TreeSet<>();
    System.out.println("---treeset----");
    ts.add("goa");
    ts.add("punjab");
    ts.add("delhi");
    ts.add("kanpur");
    for(String t:ts){
        System.out.println(t);
    }
   } 
}
