package com.daniel.packages;

public class Director extends Person {
    public Director(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Diretor: " + name);
    }

    public void studentInfo(Student student) {
        System.out.println("====== INFOS ======"+ "\nEstudante: " + student.getName() + "\nID: " + student.id + "\nSerie: " + student.getClassRoom());
    }

    public void addStudent(Student student) {
        System.out.println("Estudante " + student.getName() + " Adicionado!");
    }

    public void removeStudent(Student student) {
        System.out.println("Estudante " + student.getName() + " removido!");
    }
}
