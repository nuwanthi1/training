package com.springboot.SpringbootProject4.Service;

import com.springboot.SpringbootProject4.Dto.StudentRequest;
import com.springboot.SpringbootProject4.Dto.StudentResponse;
import com.springboot.SpringbootProject4.Exception.StudentNotFoundException;
import com.springboot.SpringbootProject4.Model.Student;
import com.springboot.SpringbootProject4.Repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



@Service
public class StudentService {
   private static final Logger logInfo = LoggerFactory.getLogger(StudentService.class);
    @Autowired
    private StudentRepository studentRepository;

    public List<StudentResponse> getAllStudents() {
        logInfo.info("Fetching all students");

        List<Student> students = studentRepository.findAll();
        List<StudentResponse> studentResponses = students.stream()
                .map(this::convertToResponse)
                .collect(Collectors.toList());

        logInfo.info("Fetched {} students", studentResponses.size());

        return studentResponses;
    }


   public StudentResponse getStudentById(String id) {
       try {
           logInfo.info("Fetching student by ID: {}", id);

           Optional<Student> optionalStudent = studentRepository.findById(id);
           Student student = optionalStudent.orElseThrow(() -> new StudentNotFoundException("Student not found with id: " + id));
           logInfo.info("Fetched student by ID: {}", id);
           return convertToResponse(student);
       } catch (StudentNotFoundException ex) {
           logInfo.error("Student not found with ID: {}", id);
           throw ex;
       }
   }

    public StudentResponse createStudent(StudentRequest request) {
        try {
            logInfo.info("Creating new student with request: {}", request);

            Student student = new Student();
            copyProperties(request, student);
            student = studentRepository.save(student);

            logInfo.info("New student created with ID: {}", student.getId());

            return convertToResponse(student);
        } catch (Exception ex) {
            logInfo.error("Failed to create student: {}", ex.getMessage());
            throw new RuntimeException("Failed to create student: " + ex.getMessage());
        }
    }

    public void deleteStudentById(String id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (!optionalStudent.isPresent()) {
            String errorMessage = "Student not found with id: " + id;
            logInfo.warn(errorMessage);
            throw new StudentNotFoundException(errorMessage);
        }
        studentRepository.deleteById(id);
        logInfo.info("Student with ID {} successfully deleted", id);
    }

    private void copyProperties(StudentRequest request, Student student) {
        student.setName(request.getName());
        student.setDateOfBirth(request.getDateOfBirth());
        student.setAverage(request.getAverage());
    }

    private StudentResponse convertToResponse(Student student) {
        StudentResponse response = new StudentResponse();
        response.setId(student.getId());
        response.setName(student.getName());
        response.setDateOfBirth(student.getDateOfBirth());
        response.setAverage(student.getAverage());
        return response;
    }
}







