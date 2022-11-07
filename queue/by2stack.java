package queue;
import java.util.*;
public class by2stack {
    static class Queue{
       static  Stack<Integer>s1=new Stack<>();
        static Stack<Integer>s2=new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        //add
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue empty");
                return -1;
            }
            return s1.pop();
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue empty");
                return -1;
            }
            return s1.peek();
        }
        //push-O(1) pop=O(N)
        public static void add1(int data){
            s1.push(data);
        }
        public static int remove1(){
            while(!s1.empty()){
                s2.push(s1.pop());
            }
            int ans=s2.pop();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return ans;
            
        }
        public static int peek1(){
           
            while(!s1.empty()){
                s2.push(s1.pop());
            }
            int ans=s2.peek();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return ans;
        }


    }
    public static void main (String args[]){
        Queue q1=new Queue();
        q1.add1(1);
        q1.add1(2);
        q1.add1(3);
        while(!q1.isEmpty()){
            System.out.println(q1.peek1());
            q1.remove1();
        }
    }
}
