package Stringl;

public class substring {
    public static String sub(String str,int s,int e){
        String substr="";
        for(int i=s;i<e;i++){
            substr+=str.charAt(i);
        }
        return substr;

    }
    public static void main(String args[]){
        String str="HelloWorld";
        System.out.println(sub(str,0,4));
    }
    
}
