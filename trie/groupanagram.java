package trie;
import java.util.*;
public class groupanagram {
    static class TRienode{
        List<String>data;
        TRienode children[];
        boolean isEnd;
        TRienode(){
            data=new ArrayList<>();
            children=new TRienode[26];
            isEnd=false;
        }
    }
    static TRienode root;
    static List<List<String>>ans;
    public static List<List<String>> groupAnagram(String strs[]){
        ans=new ArrayList<>();
        root=new TRienode();
        for(String word:strs){
            build(word);
        }
        dfs(root);
        return ans;
    }
    public static void build(String s){
        TRienode temp=root;
        char[] word=s.toCharArray();
        Arrays.sort(word);
        for(char c:word){
            TRienode child=temp.children[c-'a'];
            if(child==null){
                temp.children[c-'a']=new TRienode();
            }
            temp=temp.children[c-'a'];
        }
        temp.isEnd=true;
        temp.data.add(s);
    }
    public static void dfs(TRienode rt){
        if(rt.isEnd){
            ans.add(rt.data);
        }
        for(int i=0;i<26;i++){
            if(rt.children[i]!=null){
                dfs(rt.children[i]);
            }
        }
    }
    public static void main(String args[]){
        String str[]={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram(str));
    }


}
