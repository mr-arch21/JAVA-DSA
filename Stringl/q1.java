package Stringl;
import java.util.*;
public class q1 {
    public static int countvowel(String str){
        int  count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        System.out.println(str);
        System.out.println(countvowel(str));
    }
    
}
