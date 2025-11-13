package oop;

public class Main {
    static public  void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "red";
        myCar.model = "Mercedes";
        myCar.drive();
        myCar.stop();

        System.out.println("The model of my car is " + myCar.model);
        System.out.println("The color of my car is " + myCar.color);

    }
}
