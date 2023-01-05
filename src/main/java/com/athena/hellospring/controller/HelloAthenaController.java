package com.athena.hellospring.controller;


import com.athena.hellospring.model.entity.Student;
import com.athena.hellospring.model.request.CreateStudentRequest;
import com.athena.hellospring.model.response.StudentResponse;
import com.athena.hellospring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.athena.hellospring.repository.StudentRepository.students;

@RestController
@RequestMapping("/athena")
public class HelloAthenaController {

    @Autowired
    private StudentService service;

    @GetMapping("/jb101")
    public String willing() {
        return theEnd();
    }

    @PostMapping("/jb101")
    public String theEnd() {
        return "The End";
    }

    @PostMapping("/student")
    public ResponseEntity<StudentResponse> create(@RequestBody CreateStudentRequest request) {
        StudentResponse response = service.create(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/all")
    List<Student> gets() {
        return students;
    }

    @GetMapping("/gets")
    List<Student> get2Kn() {
        return students.stream().filter(student -> (student.getUpdatedAt().getYear() == 2025)).collect(Collectors.toList());
    }

    @GetMapping("/getss")
    Student getMaxKn() {

        return students.stream().limit(1).max(Comparator.comparing(Student::getUpdatedAt)).get();
    }
}
