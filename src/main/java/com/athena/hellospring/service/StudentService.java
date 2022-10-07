package com.athena.hellospring.service;

import com.athena.hellospring.model.request.CreateStudentRequest;
import com.athena.hellospring.model.request.UpdatedStudentRequest;
import com.athena.hellospring.model.response.StudentResponse;

public interface StudentService {
    StudentResponse create(CreateStudentRequest request);

    StudentResponse update(int id, UpdatedStudentRequest request);

    void delete(int id);

    StudentResponse read(int id);
}
