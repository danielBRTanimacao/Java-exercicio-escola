package com.consultamedica.consulta_medica.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.persistence.*;

import com.consultamedica.consulta_medica.repository.ConsultationRepository;

@Entity
public class Medic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String specialty;

    @ElementCollection
    private List<LocalDateTime> availableTime;

    @OneToMany(mappedBy = "medic")
    private List<Consultation> consultations;

    @Transient
    private ConsultationRepository consultationRepository;

    public List<LocalDateTime> getAvailableDates(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;

        List<LocalDateTime> agendados = consultationRepository.findByMedicId(this.id)
            .stream()
            .map(Consultation::getDateTime)
            .collect(Collectors.toList());

        return availableTime.stream()
            .filter(horario -> !agendados.contains(horario))
            .collect(Collectors.toList());
    }

    public void setConsultationRepository(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }
}
