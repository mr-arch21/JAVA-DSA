package greedy;

import java.util.ArrayList;

public class activity {
    public static void main(String args[]){
        int start[]={10,12,20};
        int end[]={20,25,30};
        ArrayList<Integer>ans=new ArrayList<>();
        int maxcount=1;
        ans.add(0);
        int lastend=end[0];
        for(int i=1;i<start.length;i++){
            if(start[i]>=lastend){
                maxcount++;
                ans.add(i);
                lastend=end[i];
            }
        }
        System.out.println("max activities: "+maxcount);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
