package com.athena.hellospring.controller;


import com.athena.hellospring.model.request.CreateStudentRequest;
import com.athena.hellospring.model.response.StudentResponse;
import com.athena.hellospring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

}
