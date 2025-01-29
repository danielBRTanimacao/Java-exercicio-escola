package com.consultamedica.consulta_medica.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consultamedica.consulta_medica.entities.Consultation;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
    List<Consultation> findByMedicIdAndDateTime(Long medicId, LocalDateTime dateTime);
}
