package deque;
import java.util.*;
public class queuebydeque {
    static class queue{
        Deque<Integer>d1=new LinkedList<>();
        public void push(int data){
            d1.addLast(data);
        }
        public int remove(){
            return d1.removeFirst();
        }
        public int peek(){
            return d1.getFirst();
        }
    }
        public static void main(String args[]){
            queue s=new queue();
            s.push(1);
            s.push(2);
            s.push(3);
            System.out.println("peek="+s.peek());
            System.out.println(s.remove());
            System.out.println(s.remove());
            System.out.println(s.remove());
        }
    
}
