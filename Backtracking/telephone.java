package Backtracking;

public class telephone {
    final static char[][] L={{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},
    {'j','k','l'},{'m','n','o'},{'p','q','r','s'},
    {'t','u','v'},{'w','x','y','z'}};

    public static void combintations(String C){
        int len=C.length();
        if(len==0){
            System.out.println("");
            return;
        }
         //recursionn
         bfs(0,len,new StringBuilder(),C);

        }
        public static void bfs(int pos,int len,StringBuilder sb,String C){
            if(pos==len){
                System.out.println(sb.toString());            
            }
            else {
                char[] letters=L[Character.getNumericValue(C.charAt(pos))];
                for(int i=0;i<letters.length;i++){
                    bfs(pos+1,len,new StringBuilder(sb).append(letters[i]),C);
                }
            }
        }
    
    public static void main(String args[]){
        combintations("35");
    }
}
