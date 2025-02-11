package com.medicinemanager.medicinemanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicinemanager.medicinemanager.entity.MedicineManagerEntity;
import com.medicinemanager.medicinemanager.repository.MedicineManageRepository;

@Service
public class MedicineManagerService {
    @Autowired
    private MedicineManageRepository repository;

    public List<MedicineManagerEntity> listAll() {
        return repository.findAll();
    }

    public MedicineManagerEntity findMedicineById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public MedicineManagerEntity save(MedicineManagerEntity medicineManagerEntity){
        return repository.save(medicineManagerEntity);
    }

    public void del(Long id){
        repository.deleteById(id);
    }
}
