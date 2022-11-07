package Stringl;

public class lette {
    public static void swap(char i,char j){
        char temp=i;
        i=j;
        j=temp;
    }
    public static int  sec(String s) {
        int front=0,time=0;
        while(front<s.length()-1){
            if(s.charAt(front)=='0'&& s.charAt(front+1)=='1'){
                swap(s.charAt(front),s.charAt(front+1));
                time++;
                front++;
            }
        }
        return time;
    }


    public static void main(String args[]){
       String s = "11100";
       System.out.println(sec(s));
    }
    
}
