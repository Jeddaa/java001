package oop.encapsulation;


public class Main {
    static public  void main(String[] args) {
        Student student = new Student();
        student.setName("Fatihah Oduwole");
        student.setAge(19);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
