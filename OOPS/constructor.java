package OOPS;

public class constructor {
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student("aman");
        Student s3=new Student(34);
        // System.out.println(s1.name);
    }
    
}
class Student{
    String name;
    int roll;
    Student(){
        // this.name=name;
      System.out.println("constructor is called...");
    }
    Student(String name) {
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
}
