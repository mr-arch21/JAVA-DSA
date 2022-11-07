package deque;
import java.util.*;
public class stackbydeque {
    static class stack{
    Deque<Integer>d1=new LinkedList<>();
    public void push(int data){
        d1.addLast(data);
    }
    public int pop(){
        return d1.removeLast();
    }
    public int peek(){
        return d1.getLast();
    }
}
public static void main(String args[]){
    stack s=new stack();
    s.push(1);
    s.push(2);
    s.push(3);
    System.out.println("peek="+s.peek());
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());
}
}
