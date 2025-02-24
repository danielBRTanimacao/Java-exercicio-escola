package com.daniel.packages;

public class Student extends Person{
    private String gradeSchool;

    public Student(String name, String gradeSchool) {
        super(name);
        this.gradeSchool = gradeSchool;
    }

    @Override
    public void displayInfo() {
        System.out.println("Estudante: " + name + " serie " + gradeSchool);
    }

    public String getClassRoom() {
        return this.gradeSchool;
    }
}
