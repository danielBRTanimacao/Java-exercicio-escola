package com.medicinemanager.medicinemanager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicinemanager.medicinemanager.service.MedicineManagerService;
import com.medicinemanager.medicinemanager.entity.MedicineManagerEntity;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class MedicineManagerController {
    private final MedicineManagerService service;

    public MedicineManagerController(MedicineManagerService service){
        this.service = service;
    }
    
    @GetMapping
    public List<MedicineManagerEntity> list_medicines() {
        return service.listAll();
    }

    @GetMapping("/{id}")
    public MedicineManagerEntity specific_medicine(@PathVariable Long id) {
        return service.findMedicineById(id);
    }

    @PostMapping
    public MedicineManagerEntity save_medicine(@RequestBody MedicineManagerEntity medicine) {
        return service.save(medicine);
    }

    @DeleteMapping("/{id}")
    public void del_medicine(@PathVariable Long id){
        service.del(id);
    }
}
