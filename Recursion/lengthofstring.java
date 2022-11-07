package Recursion;

public class lengthofstring {
     public static int countlength(String str){
        if(str.length()==0){
            return 0;
        }
        return countlength(str.substring(1))+1;
     }

    public static void main(String args[]){
        String str="aryan";
        System.out.println(countlength(str));
    }
    
}
