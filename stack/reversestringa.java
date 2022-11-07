package stack;

import java.util.*;

public class reversestringa {
    public static String reverseS(String str){
        Stack<Character>st=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            st.push(str.charAt(idx));
            idx++;
        }
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()){
            char curr=st.pop();
            res.append(curr);
        }
        str=res.toString();
        return str;
    }
    public static void main(String args[]){
        String str="aryan";
        System.out.println(reverseS(str));
    }
}
