package javabasic;
import java.util.*;
public class totalcost {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float pen=sc.nextFloat();
        float pencil=sc.nextFloat();
        float eraser=sc.nextFloat();
        float cost=pen+pencil+eraser;
        sc.close();
        float gst=(cost*18)/100;
        float total_bill=cost+gst;
        System.out.println("total cost with includes gst : "+total_bill);
        
        
    }
}
