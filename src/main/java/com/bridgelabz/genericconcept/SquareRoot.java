package com.bridgelabz.genericconcept;
public class SquareRoot {
    public static void main(String[] args) {
        Human obj1=new Human();
        obj1.food();

        Human obj2=new boy();
        obj2.food();
    }
}
//    Method overloading example
class Human {
    public void food(){
        System.out.println("Human need food daily for energy");
    }
}
class boy extends Human{
    public void food(){
        System.out.println("Boy need food daily for energy");
    }
}