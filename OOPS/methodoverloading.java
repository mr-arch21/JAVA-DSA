package OOPS;

public class methodoverloading {
    public static void main(String args[]){
    Calculator calci=new Calculator();
    System.out.println(calci.sum(1,2,3));
    
    System.out.println(calci.sum((float)4.5, (float)4.8));
}
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b, int c){
        return a+b+c;
    }
}

