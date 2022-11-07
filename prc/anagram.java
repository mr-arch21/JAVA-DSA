package prc;
import java.util.*;
public class anagram {
    public static void main(String args[]){
        String s1="race";
        String s2="care";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()==s2.length()){
            char[] sc1=s1.toCharArray();
            char[] sc2=s2.toCharArray();
            Arrays.sort(sc1);
            Arrays.sort(sc2);
            boolean res=Arrays.equals(sc1,sc2);
            if(res){
                System.out.println("s1 and s2 are anagram");
            }else{
                System.out.println("s1 and s2 are not anagram");
            }

        }
        else{
            System.out.println("s1 and s2 are not anagram");
        }

    }
    
}
