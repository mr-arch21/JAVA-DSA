package OOPS;

import javax.swing.plaf.synth.SynthStyle;

public class abstraction {
    public static void main(String args[]){
            Horse h=new Horse();
            h.eat();
            h.walk();
            System.out.println(h.color);
            h.changeColor();
            System.out.println(h.color);
    }
}

//abstract class
abstract class Animal{
    //constructor in abstract class
    String color;
    Animal(){
        color="peach";
        System.out.println( "animal constructor called");

    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();//abstract method this is idea abstraction
}
class Horse extends Animal{
    Horse(){
    System.out.println("horse constructor called");
    }
    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color=" brown";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
