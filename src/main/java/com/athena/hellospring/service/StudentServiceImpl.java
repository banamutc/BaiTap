package com.athena.hellospring.service;

import com.athena.hellospring.model.entity.Student;
import com.athena.hellospring.model.request.CreateStudentRequest;
import com.athena.hellospring.model.request.UpdatedStudentRequest;
import com.athena.hellospring.model.response.StudentResponse;
import com.athena.hellospring.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public StudentResponse create(CreateStudentRequest request) {
        Student student = new Student();
        student.setName(request.getName());
        student.setClassName(request.getClassName());
        student.setDateOfBirth(request.getDateOfBirth());
        student.setCreatedAt(LocalDateTime.now());
        student.setUpdatedAt(LocalDateTime.now());
        // fake repository local memory instead of mysql db
        StudentRepository.students.add(student);

        return new StudentResponse(student);
    }

    @Override
    public StudentResponse update(int id, UpdatedStudentRequest request) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public StudentResponse read(int id) {
        return null;
    }
}
