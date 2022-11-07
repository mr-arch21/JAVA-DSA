package OOPS;

public class heirarchialinheritance {
    public static void main(String args[]){
        // Fish shark=new Fish();
        // shark.eat();
        dog duggu=new dog();
        duggu.eat();
        duggu.legs=4;
        System.out.println(duggu.legs);
    }
}
class Animal{//properties
    String color;
    void  eat(){//function
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("walks");
    }
}