package arlist;
import java.util.*;
public class beautiful {
    //iterative
    public static ArrayList<Integer> beautifulA(int n){
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(1);
        for(int i=2;i<=n;i++){
            ArrayList<Integer>temp=new ArrayList<>();
            for(Integer e:ans){
                if(2*e<=n){
                    temp.add(e*2);
                }
            }
            for(Integer e:ans){
                if(2*e-1<=n){
                    temp.add(e*2-1);
                }
            }
            ans=temp;
        }
        return ans;
    }
    //divideandconquer
    public static ArrayList<Integer> bA(int n){
        ArrayList<Integer>res=new ArrayList<>();
        divideconquer(1,1,res,n);
        return res;
    }
    private static  void divideconquer(int start,int increment, ArrayList<Integer>res,int n){
       if(start+increment>n){
        res.add(start);
        return;
       } 
       divideconquer(start, 2*increment, res, n);
       divideconquer(start +increment,2*increment, res, n);
    }
   public static void main(String args[]){
    int n=5;
    System.out.println(bA(n));
    System.out.println(beautifulA(n));
   } 
   } 

