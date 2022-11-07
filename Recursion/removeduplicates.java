package Recursion;

public class removeduplicates {
    public static void removeduplicat(String str,int index,StringBuilder newstr,boolean map[]){
            if(index==str.length()){
                System.out.println(newstr);
                return;
            }
            //kaam
            char currChar=str.charAt(index);
            if(map[currChar-'a']==true){
                //duplicate
                removeduplicat(str, index+1, newstr, map);
            }else{
                map[currChar-'a']=true;
                removeduplicat(str, index+1, newstr.append(currChar), map);
            }
    }
    public static void main(String args[]){
        String str="appnaacollege";
        removeduplicat(str,0, new StringBuilder(""), new boolean[26]);

    }
}
