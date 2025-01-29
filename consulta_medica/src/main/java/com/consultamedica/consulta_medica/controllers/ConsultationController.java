package com.consultamedica.consulta_medica.controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.consultamedica.consulta_medica.entities.Consultation;
import com.consultamedica.consulta_medica.services.ConsultationService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api/consultas")
public class ConsultationController {
    @Autowired
    private ConsultationService consultationService;

    @PostMapping("/agendar")
    public ResponseEntity<Consultation> scheduleAppointment(
        @RequestParam Long pacientId,
        @RequestParam Long medicId,
        @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dateTime) {
        
        Consultation consult = consultationService.scheduleAppointment(pacientId, medicId, dateTime);
        return ResponseEntity.ok(consult);
    }
    
}
