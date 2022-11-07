package OOPS;

public class Inheritance {
    public static void main(String args[]){
        // Fish shark=new Fish();
        // shark.eat();
        dog duggu=new dog();
        duggu.eat();
        duggu.legs=4;
        System.out.println(duggu.legs);
    }
    
}
//BAse Class
class Animal{//properties
    String color;
    void  eat(){//function
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
//Derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}
//multilevel inheritance
class mammal extends Animal{
    int legs;
}
class dog extends mammal{
    String breed;
}

