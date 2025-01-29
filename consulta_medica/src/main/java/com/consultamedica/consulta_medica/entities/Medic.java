package com.consultamedica.consulta_medica.entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String specialty;
    
    @ElementCollection
    private List<LocalDateTime> availableTime;

    public List<Consultation> getDisponibleDates() {
        throw new UnsupportedOperationException("Unimplemented method 'getDisponibleDates'");
    }
}
