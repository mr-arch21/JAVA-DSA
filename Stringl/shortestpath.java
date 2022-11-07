package Stringl;
import java.util.*;

public class shortestpath {
    public static float shortest(String str1){
        float x=0,y=0;
        for(int i=0;i<str1.length();i++){//O(n)
            
            if(str1.charAt(i)=='E'){
                x++;
            }else if(str1.charAt(i)=='W'){
                x--;

            }else if(str1.charAt(i)=='N'){
                y++;
            }else{
                y--;
            }

            
        }
        float X2=x*x;
        float Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static void main(String args[]){
        String str1="WNEENESENNN";
        System.out.println(shortest(str1));
    }
    
}
