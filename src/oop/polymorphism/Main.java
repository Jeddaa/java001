package oop.polymorphism;

import oop.inheritance.Animal;
import oop.inheritance.Dog;

public class Main {
    static public  void main(String[] args) {
        MathOperation math = new MathOperation();
        System.out.println(math.add(1,2,3));
        System.out.println(math.add(1,2));

        Animal animal = new Dog();
        animal.eat();
    }
}
