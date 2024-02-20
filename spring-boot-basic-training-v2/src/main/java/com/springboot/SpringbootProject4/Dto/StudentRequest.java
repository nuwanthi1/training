package com.springboot.SpringbootProject4.Dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentRequest {
    private String name;
    private LocalDate dateOfBirth;
    private double average;
}
