package greedy;
import java.util.*;
public class opactivity {
   public static void main(String args[]){
        int start[]={3,1,0,8,5,5};
        int end[]={4,2,6,9,7,9};
        int activities[][]=new int[start.length][3];
        //ind 0=index,1=start,end=2;
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //lambda function-->
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        int maxcount=1;
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(activities[0][0]);
        int lastend=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastend){
                maxcount++;
                ans.add(activities[i][0]);
                lastend=activities[i][2];
            }
        }
        System.out.println("max count is ="+maxcount);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    } 
}
