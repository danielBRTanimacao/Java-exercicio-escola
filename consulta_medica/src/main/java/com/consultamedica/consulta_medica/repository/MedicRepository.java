package com.consultamedica.consulta_medica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consultamedica.consulta_medica.entities.Medic;

public interface MedicRepository extends JpaRepository<Medic, Long>{
    
}
