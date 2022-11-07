package greedy;
import java.util.*;
public class jobseq {
    public static class Job{
        int deadline;
        int profit;
        int id;
        public Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String args[]){
        int JobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job>Jobs=new ArrayList<>();
        for(int i=0;i<JobInfo.length;i++){
            Jobs.add(new Job(i,JobInfo[i][0],JobInfo[i][1]));
        }
        Collections.sort(Jobs,(o1,o2)->o2.profit-o1.profit);
        ArrayList<Integer>seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<Jobs.size();i++){
            Job curr=Jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("max jobs="+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();

    }
}
