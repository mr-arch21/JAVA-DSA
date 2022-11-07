package OOPS;

public class one {
    public static void main(String args[]){
        Pen p1=new Pen();//this is a constructor created a pen object  called p1
        p1.setColor("blue");
        // System.out.println(p1.color);
        System.out.println(p1.getColor());
        p1.setTip(7);
        // System.out.println(p1.tip);
        System.out.println(p1.getTip());
        // p1.color="red";
        // System.out.println(p1.color);
        p1.setColor("red");
        System.out.println(p1.getColor());
    }
}
class Pen{
   private String color;
   private int tip;

    String getColor(){//getter
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){//setter
        this.color=newColor;
    }

    void setTip(int newTip){
        this.tip=newTip;
    }


}

class Student{
    String name;
    int age;
    float percentage;
    void calcPercantage(int phy,int che, int math){
        percentage=(phy+che+math)/3;
    }
}
