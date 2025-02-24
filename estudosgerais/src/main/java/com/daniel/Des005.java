package com.daniel;

import com.daniel.packages.Director;
import com.daniel.packages.Student;

public class Des005 {
    public static void main(String[] args) {
        Director principal = new Director("Principal");
        Student student = new Student("Daniel", "1A");

        principal.displayInfo();
        principal.addStudent(student);
        principal.studentInfo(student);
    }
}