package prc;
import java.util.*;



public class sorting {
    public static void bubble(int n[]){
        for(int turn=0;turn<n.length-1;turn++){
            for(int j=0;j<n.length-1-turn;j++){
                if(n[j]>n[j+1]){
                    int temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
    }
    public static void selection(int n[]){
        for(int i=0;i<n.length;i++){
            int min=i;
            for(int j=i+1;j<n.length;j++){
                if(n[j]<n[min]){
                    min=j;
                }
            }
            int temp=n[min];
            n[min]=n[i];
            n[i]=temp;

        }
    }
    public static void insertion(int n[]){
        for(int i=1;i<n.length;i++){
            int cur=n[i];
            int prec=i-1;
            while(prec>=0 && n[prec]>cur){
                n[prec+ 1]=n[prec];
                prec--;
            }
            n[prec+1]=cur;
        }
    }
    public static void counting(int n[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            largest=Math.max(largest, n[i]);
        
        }
        int count[]=new int[largest+1];
        for(int i=0;i<n.length;i++){
            count[n[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                n[j]=i;
                j++;
                count[i]--;

            }   
        }

           
    }
        
    
    public static void main(String args[]){
        int n[]={5,3,2,7,1,33,22};
        counting(n);
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
    
}
