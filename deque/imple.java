package deque;
import java.util.*;
public class imple {
    public static void main(String args[]){
        Deque<Integer>d1=new LinkedList<>();
        d1.addFirst(1);
        d1.addFirst(2);
        d1.addLast(5);
        System.out.println(d1);
        d1.removeFirst();
        System.out.println(d1);
        System.out.println(d1.getFirst());
    }
}
