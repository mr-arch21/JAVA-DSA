package prc;

public class pairs {
    public static void pa(int n[]){
        int c=0;
        for(int i=0;i<n.length;i++){
           
            for(int j=i+1;j<n.length;j++){
                System.out.print("("+n[i]+","+n[j]+") ");
                c++;
            }
            System.out.println();
           
        }
        System.out.println("pairs:"+c);
    }
    public static void main(String args[]){
        int n[]={2,4,6,8};
        pa(n);
    }
}
