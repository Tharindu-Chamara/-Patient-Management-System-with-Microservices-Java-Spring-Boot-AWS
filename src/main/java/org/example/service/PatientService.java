package org.example.service;

import org.example.dto.PatientRequestDTO;
import org.example.dto.PatientResponseDTO;

import java.util.List;

public interface PatientService {

    public List<PatientResponseDTO> getPatients();

    public void addPatient( PatientRequestDTO patientRequestDTO);
}
