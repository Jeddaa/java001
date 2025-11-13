package oop.abstraction;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    public void draw(){
        System.out.println("The circle is drawn");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw(){
        System.out.println("The rectangle is drawn");
    }
}
