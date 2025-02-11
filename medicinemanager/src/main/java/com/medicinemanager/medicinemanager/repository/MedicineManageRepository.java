package com.medicinemanager.medicinemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicinemanager.medicinemanager.entity.MedicineManagerEntity;

public interface  MedicineManageRepository extends JpaRepository<MedicineManagerEntity, Long>{
    
}
