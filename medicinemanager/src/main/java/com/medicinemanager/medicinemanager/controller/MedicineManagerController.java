package com.medicinemanager.medicinemanager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/remedios")
public class MedicineManagerController {
    
    @GetMapping()
    public String list_medicines() {
        return "Hello!";
    }
    
}
