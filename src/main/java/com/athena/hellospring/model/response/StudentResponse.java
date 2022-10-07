package com.athena.hellospring.model.response;

import com.athena.hellospring.model.entity.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class StudentResponse {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private String className;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public int getId() {
        return id;
    }

    public StudentResponse setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentResponse setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public StudentResponse setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getClassName() {
        return className;
    }

    public StudentResponse setClassName(String className) {
        this.className = className;
        return this;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public StudentResponse setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public StudentResponse setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public StudentResponse(Student student) {
        this.id = student.getId();
        this.name = student.getName();
        this.dateOfBirth = student.getDateOfBirth();
        this.className = student.getClassName();
        this.createdAt = student.getCreatedAt();
        this.updatedAt = student.getUpdatedAt();
    }
}
