package org.example.controller;


import lombok.RequiredArgsConstructor;
import org.example.dto.PatientRequestDTO;
import org.example.dto.PatientResponseDTO;
import org.example.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;

    @GetMapping
    public List<PatientResponseDTO> getPatients(){
        return patientService.getPatients();
    }

    @PostMapping
    public void addPatient(@RequestBody PatientRequestDTO patientRequestDTO){
        patientService.addPatient(patientRequestDTO);
    }


}
