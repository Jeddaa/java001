package oop.inheritance;

public class Dog extends Animal {
    void bark(){
        System.out.println("The dog barks");
    }
    @Override
    public void eat(){
        System.out.println("The dog eating");
    }
}