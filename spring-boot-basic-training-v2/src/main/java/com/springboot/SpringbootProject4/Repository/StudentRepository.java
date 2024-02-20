package com.springboot.SpringbootProject4.Repository;
import com.springboot.SpringbootProject4.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

}
