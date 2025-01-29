package com.consultamedica.consulta_medica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consultamedica.consulta_medica.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
   
}
