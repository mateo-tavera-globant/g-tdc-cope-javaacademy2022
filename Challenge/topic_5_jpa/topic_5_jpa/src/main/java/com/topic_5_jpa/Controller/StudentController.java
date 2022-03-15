package com.topic_5_jpa.Controller;

import com.topic_5_jpa.Model.Students;
import com.topic_5_jpa.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    //Create student
    @PatchMapping
    public ResponseEntity<?> create(@RequestBody Students student){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.save(student));
    }

    //Read student
    @GetMapping("/{id}")
    public ResponseEntity<?> read (@PathVariable(value = "id") Long studentId){
        Optional<Students>optionalStudents = studentService.findById(studentId);

        if (!optionalStudents.isPresent()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(optionalStudents);
    }




}
