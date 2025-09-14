package org.example.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PatientRequestDTO {

    private String name;
    private String email;
    private String address;
    private LocalDate dateOfBirth;
    private LocalDate registrationDate;


}
