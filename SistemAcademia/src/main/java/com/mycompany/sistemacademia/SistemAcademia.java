/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
*/

package com.mycompany.sistemacademia;

/**
 *
 * @author danie
*/


public class SistemAcademia {
    String name;
    int age;
    char sex;
    float height;
    double weight;

    public static void main(String[] args) {
        SistemAcademia person = new SistemAcademia();
        person.name = "cururu";
        person.age = 29;
        person.height = 1.89f;
        person.sex = 'M';
        person.weight = 98.3;
        System.out.println(person);
    }
}