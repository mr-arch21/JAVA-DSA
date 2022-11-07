package OOPS;

public class deepcopy {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="aryan";
        s1.roll=56;
        s1.password="abcf";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student s2=new Student(s1);
        s2.password="bhv";
        s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
       
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];

     //deep copy constructor
     Student(Student s1){
        marks=new int[3];

        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }

     }
    Student(){
        marks=new int[3];
        System.out.println(" constructor is called");


    }

}
