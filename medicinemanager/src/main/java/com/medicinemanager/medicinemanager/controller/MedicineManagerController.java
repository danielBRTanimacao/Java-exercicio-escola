package com.medicinemanager.medicinemanager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/remedios")
public class MedicineManagerController {
    
    @GetMapping()
    public Map<String, String> list_medicines() {
        return Map.of("ok","ok");
    }
    
}
