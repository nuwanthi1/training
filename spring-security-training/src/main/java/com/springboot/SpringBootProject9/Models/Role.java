package com.springboot.SpringBootProject9.Models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "roles")
public class Role {
    @Id
    private String id;

    private ERole name;


}
