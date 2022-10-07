package com.athena.hellospring.model.request;

import java.time.LocalDate;

public class CreateStudentRequest {
    private String name;
    private LocalDate dateOfBirth;
    private String className;

    public String getName() {
        return name;
    }

    public CreateStudentRequest setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public CreateStudentRequest setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getClassName() {
        return className;
    }

    public CreateStudentRequest setClassName(String className) {
        this.className = className;
        return this;
    }
}
