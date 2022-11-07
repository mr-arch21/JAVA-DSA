package stack;
import java.util.*;

public class implebyarL {
    static class Stack{
    static ArrayList<Integer>list=new ArrayList<>();
    // isempty
    public static boolean isEmpty(){
        return list.size()==0;
    }
    //PUSH
    public static void push(int data){
        list.add(data);
    }
    //POP
    public static int pop(){
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    //PEEK
    public static int peek(){
        return list.get(list.size()-1);
    }
}

    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    
}
}

