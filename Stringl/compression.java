package Stringl;

public class compression {
    public static String compress(String str){
        String newstr="";
        for(int i=0;i<str.length();i++){//O(n)
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;//kyuki i++ ho raha total operation n tk hi honge
            }
            newstr+=str.charAt(i);
            if(count>1){
                newstr+=count.toString();
            }
            
        }
        return newstr;
    }
    public static String compressoptimal(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String args[]){
        String str="aaaabbbbcccddef";
        System.out.println(compressoptimal(str));
    }
}
