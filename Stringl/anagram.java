package Stringl;

import java.util.Arrays;

public class anagram {
    public static void main(String args[]){
        String s1="earth";
        String s2="heart";
        //first convert into lowercase
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        //first check if the length are the same
        if(s1.length()==s2.length()){
            //conver t string into  char array
            char[] s1tocharArray=s1.toCharArray();
            char[] s2tocharArray=s2.toCharArray();
            //sort the char array
            Arrays.sort(s1tocharArray);
            Arrays.sort(s2tocharArray);
            System.out.println(s1tocharArray+" "+s2tocharArray);


            boolean res=Arrays.equals(s1tocharArray,s2tocharArray);
            if(res){
                System.out.println("s1 and s2 are anagram");
            }else{
                System.out.println("s1 and s2 are not anagram");
            }
        }else{
            System.out.println("s1 and s2 are not anagram");
        }
    }
}
