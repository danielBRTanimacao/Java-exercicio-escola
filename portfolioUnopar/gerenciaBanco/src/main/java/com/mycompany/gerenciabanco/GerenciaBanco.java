/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciabanco;

/**
 *
 * @author danie
 */

import java.util.ArrayList;
import java.util.List;

public class GerenciaBanco {

    public static void main(String[] args) {
        dataPerson("daniel", "19", "101", "1.85", "M");
        
    }
    
    public static void dataPerson(String person, String age, String weight, String height, String sex) {
        List<String> lista = new ArrayList<>();
        lista.add(person);
        lista.add(age);
        lista.add(weight);
        lista.add(height);
        lista.add(sex);
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
