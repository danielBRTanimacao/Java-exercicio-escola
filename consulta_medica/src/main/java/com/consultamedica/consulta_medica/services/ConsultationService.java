package com.consultamedica.consulta_medica.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consultamedica.consulta_medica.entities.Consultation;
import com.consultamedica.consulta_medica.entities.Medic;
import com.consultamedica.consulta_medica.entities.Patient;
import com.consultamedica.consulta_medica.repository.ConsultationRepository;
import com.consultamedica.consulta_medica.repository.MedicRepository;
import com.consultamedica.consulta_medica.repository.PatientRepository;

@Service
public class ConsultationService {
    @Autowired
    private ConsultationRepository consultationRepository;

    @Autowired
    private MedicRepository medicRepository;

    @Autowired
    private PatientRepository patientRepository;

    public Consultation scheduleAppointment(Long patientId, Long medicId, LocalDateTime dateTime) {
        Medic medic = medicRepository.findById(medicId)
            .orElseThrow(() -> new RuntimeException("Médico não encontrado!"));

        Patient patient = patientRepository.findById(patientId)
            .orElseThrow(() -> new RuntimeException("Paciente não encontrado!"));

        boolean jaScheduled = !consultationRepository.findByMedicIdAndDateTimeBetween(medicId, dateTime, dateTime).isEmpty();

        if (jaScheduled || !medic.getAvailableDates(consultationRepository).contains(dateTime)) {
            throw new RuntimeException("Horário indisponível");
        }

        Consultation consult = new Consultation();
        consult.setMedic(medic);
        consult.setDateTime(dateTime);
        consult.setPatient(patient);
        return consultationRepository.save(consult);
    }
}
