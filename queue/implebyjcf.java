package queue;
import java.util.*;
public class implebyjcf {
    public static void main(String args[]){
        // Queue<Integer>qu=new LinkedList<>();
        Queue<Integer>qu=new ArrayDeque<>();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        while(!qu.isEmpty()){
            System.out.println(qu.peek());
            qu.remove();
        }
    }
}
