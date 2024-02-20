package com.springboot.SpringbootProject4.Controller;
import com.springboot.SpringbootProject4.Dto.StudentRequest;
import com.springboot.SpringbootProject4.Dto.StudentResponse;
import com.springboot.SpringbootProject4.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/v2/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/student-management/students")
    public List<StudentResponse> getAllStudents() {
        return studentService.getAllStudents();
    }


    @GetMapping("/student-management/students/{id}")
    public ResponseEntity<StudentResponse> getStudentById(@PathVariable String id) {
        StudentResponse studentResponse = studentService.getStudentById(id);
        return ResponseEntity.ok(studentResponse);
    }

    @PostMapping("/student-management/new-student")
    public ResponseEntity<StudentResponse> createStudent(@RequestBody StudentRequest request) {
        StudentResponse createdStudent = studentService.createStudent(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);
    }

    @DeleteMapping("/student-management/remove-students/{id}")
    public ResponseEntity<String> deleteStudentById(@PathVariable String id) {
        studentService.deleteStudentById(id);
        String successMessage = "Student with id " + id + " successfully deleted";
        return ResponseEntity.ok(successMessage);
    }

}






