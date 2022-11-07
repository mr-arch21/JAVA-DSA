package greedy;
import java.util.*;
public class minabsolutediff {
   public static void main(String args[]){
    int A[]={1,2,3};
    int b[]={2,1,3};
    Arrays.sort(A);
    Arrays.sort(b);
    int mindiff=0;
    for(int i=0;i<A.length;i++){
        mindiff+=Math.abs(A[i]-b[i]);
    }
    System.out.println("min absolute differnce="+mindiff);
   } 
}
