package com.consultamedica.consulta_medica.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consultamedica.consulta_medica.entities.Consultation;
import com.consultamedica.consulta_medica.entities.Medic;
import com.consultamedica.consulta_medica.repository.ConsultationRepository;
import com.consultamedica.consulta_medica.repository.MedicRepository;

@Service
public class ConsultationService {
    @Autowired
    private ConsultationRepository consultationRepository;

    @Autowired
    private MedicRepository medicRepository;

    public Consultation scheduleAppointment(Long patientId, Long medicId, LocalDateTime dateTime) {
        Medic medic = medicRepository.findById(medicId).orElseThrow(() -> new RuntimeException("Medico não foi encontrado!"));

        boolean jaScheduled = ConsultationRepository
            .findByMedicIdAndDateTime(medicId, dateTime)
            .size() > 0;

        if (jaScheduled || !medic.getDisponibleDates().contains(dateTime)) {
            throw new RuntimeException("Horario disponivel");
        }
    }

    Consultation consult = new Consultation();
    consult.setMedic(medic);
    consult.setDataTime(dateTime);
    consult.setPaciente(new patient());
    return consultationRepository.save(consult);
}
