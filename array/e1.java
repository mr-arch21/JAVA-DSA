package array;
import java.util.*;
public class e1 {
    public static void main(String args[]){
        int num1[]={3,4,10};
        int num2[]={1,4,8};
        int target=5;
        int c=0;
        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num2.length;j++){
                if(Math.abs(num1[i]-num2[j])==target){
                    System.out.print("("+i+" ,"+j+")");
                    c++;
                }
            }
        }
        if(c==0){
            System.out.println("( -1,-1)");
        }
    }
}
