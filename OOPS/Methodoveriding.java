package OOPS;

public class Methodoveriding {
    public static void main(String args[]){
        Deer d1= new Deer();
        d1.eat();
    }
}
class Animal{
    void eats(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
   void eat(){
    System.out.println("eats grass");
   }
}