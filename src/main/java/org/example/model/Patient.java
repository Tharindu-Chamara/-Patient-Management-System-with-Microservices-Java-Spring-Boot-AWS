package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
public class Patient{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;
    @Email
    private String Email;
    private String address;;
    private LocalDate dataOfBirth;
    private LocalDate registrationDate;

}
