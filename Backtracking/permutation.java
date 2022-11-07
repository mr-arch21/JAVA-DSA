package Backtracking;

public class permutation {
    public static void findpermutation(String s,String ans){//O(n*n!)
       //base case
       if(s.length()==0){
        System.out.println(ans);
        return;
       }
       
        //recursion
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            String NewStr=s.substring(0, i)+s.substring(i+1);
            findpermutation(NewStr, ans+curr);
        }
        
    }
    public static void main(String args[]){
        String s="abc";
        findpermutation(s," ");
    }    
}
