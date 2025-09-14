package org.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.example.dto.PatientRequestDTO;
import org.example.dto.PatientResponseDTO;
import org.example.model.Patient;
import org.example.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;
    private final ObjectMapper mapper;

    public List<PatientResponseDTO> getPatients() {
        List<PatientResponseDTO> patientDTOs = new ArrayList<>();

        patientRepository.findAll().forEach(patient -> {
            PatientResponseDTO dto = mapper.convertValue(patient, PatientResponseDTO.class);
            patientDTOs.add(dto);
        });

        return patientDTOs;
    }

    @Override
    public void addPatient( PatientRequestDTO patientRequestDTO) {
         patientRepository.save(mapper.convertValue(patientRequestDTO, Patient.class));
    }


}
