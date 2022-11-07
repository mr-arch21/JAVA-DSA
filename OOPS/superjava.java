package OOPS;

public class superjava {
    public static void main(String args[]){
        Horse h=new Horse();
        System.out.println(h.Color);
    }
}
class Animal{
    String Color;
    Animal(){
        System.out.println("animal constructor");
    }
}
class Horse extends Animal{
    Horse(){
        super.Color="brown";
        System.out.println("horse constructor");
    }
}

