package pqandheaps;
import java.util.*;
public class nearbycar {
    static class Point implements Comparable<Point>{
        int x,y;
        int idx;
        int distsq;
        public Point(int x,int y,int idx,int distsq){
            this.x=x;
            this.y=y;
            this.idx=idx;
            this.distsq=distsq;
        }
        @Override
        public int compareTo(Point p2){
            return this.distsq-p2.distsq;
        }
    }
    public static void main(String args[]){
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<Point>pq=new PriorityQueue<>();
        for(int i=0;i<pts.length;i++){
            int distsq=pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0],pts[i][1],distsq,i));
        }
        //neares k cars
        for(int i=0;i<k;i++){
            System.out.println("C "+pq.remove().idx);
        }
    }
}
