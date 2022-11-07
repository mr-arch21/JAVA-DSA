package Stringl;

public class palindrome {
    public static boolean ispal(String str1){
        for(int i=0;i<str1.length()/2;i++){
            if(str1.charAt(i)==str1.charAt(str1.length()-i-1)){
                return true;
            }
        }
        return false;
    }
    public static void main (String args[]){
        String str1="noon";
        System.out.println(ispal(str1));
    }
    
}
