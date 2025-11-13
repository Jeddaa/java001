package oop;

public class Car {
    String model;
    String color;

//    Car(String name, String color) {}

    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    void drive(){
        System.out.println("The car is driving");
    }

    void stop(){
        System.out.println("The car has stopped");
    }

}
