package com.daniel.packages;

public class Director extends Person {
    public Director(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Diretor: " + name);
    }

    public void addStudent(Student student) {
        student.displayInfo();
    }
}
