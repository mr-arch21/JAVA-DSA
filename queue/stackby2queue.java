package queue;
import java.util.*;

public class stackby2queue {
    static class stack{
        static Queue<Integer>q1=new LinkedList<>();
        static Queue<Integer>q2=new LinkedList<>();
        public static boolean isEmpty(){
            return q1.isEmpty()&&q2.isEmpty();
        }
        //add
        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }
        //remove
        public static int pop(){
            if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
            int top=-1;
            //case 1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }else{//case 2
                while(!q2.isEmpty()){
                    top=q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
            int top=-1;
            //case 1
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top=q1.remove();
                    q2.add(top);
                }
            }else{//case 2
                while(!q2.isEmpty()){
                    top=q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }

        //push(O(n))
        public static void push1(int data){
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            q1.add(data);
            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }
        //pop
        public static int pop1(){
            if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
            return q1.remove();
        }
        //peek
        public static int peek1(){
            if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
            return q1.peek();
        }
    }
    public static void main(String args[]){
        stack s=new stack();
        s.push1(1);
        s.push1(2);
        s.push1(3);
        while(!s.isEmpty()){
            System.out.println(s.peek1());
            s.pop1();
        }
    }    
    
}
