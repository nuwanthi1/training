package com.springboot.SpringbootProject4.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "student")
public class Student {
    @Id
    private String id;
    private String name;
    private LocalDate dateOfBirth;
    private double average;
}


