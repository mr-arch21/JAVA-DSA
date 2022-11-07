package OOPS;

public class staticjava {
    public static void main(String args[]){
        Student s1=new Student();
        s1.school="dps";
        Student s2=new Student();
        System.out.println(s2.school);

    }
}
class Student{
    static int returnPercentage(int math,int phy,int chem){
        return (math+phy+chem)/3;
    }
    String name;
    int roll;
    static String school; 
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
