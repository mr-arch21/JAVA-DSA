package Recursion;

public class numtolette {
    static String digit[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    
    public static void printdig(int n){
        if(n==0){
            return;
        }
        int lastdigit=n%10;
        
        printdig(n/10);
        System.out.print(digit[lastdigit]+" ");
    }
    public static void main(String args[]){
        printdig(1234);
    }
    
}
