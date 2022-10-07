package com.athena.hellospring.repository;

import com.athena.hellospring.model.entity.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public interface StudentRepository {
    // mock data
    LocalDateTime moment1 = LocalDateTime.now();
    LocalDateTime moment2 = LocalDateTime.now().minusDays(1).minusHours(1);
    LocalDateTime moment3 = LocalDateTime.now().minusDays(2).minusHours(3);
    LocalDateTime moment4 = LocalDateTime.now().minusDays(3).minusHours(2);
    List<Student> students = new ArrayList<>() {
        {
            add(new Student(1, "Thang", LocalDate.parse("2001-10-10"), "JB101", moment1, moment3));
            add(new Student(2, "Nam", LocalDate.parse("2001-10-10"), "ReactJS1156", moment2, moment4));
            add(new Student(3, "Đức", LocalDate.parse("2001-10-10"), "JSB123", moment1, moment3));
            add(new Student(4, "Đạo", LocalDate.parse("2001-10-10"), "JB101", moment1, moment1));
            add(new Student(5, "Ánh", LocalDate.parse("2001-10-10"), "JB101", moment3, moment3));
            add(new Student(6, "Công", LocalDate.parse("2001-10-10"), "JB112", moment4, moment4));
            add(new Student(7, "Hiệp", LocalDate.parse("2001-10-10"), "JB101", moment2, moment3));
            add(new Student(8, "Đạt", LocalDate.parse("2001-10-10"), "C101", moment4, moment3));
            add(new Student(9, "Giang", LocalDate.parse("2001-10-10"), "JB112", moment1, moment2));
            add(new Student(10, "Hiếu", LocalDate.parse("2001-10-10"), "JSB123", moment1, moment3));
            add(new Student(11, "Oanh", LocalDate.parse("2001-10-10"), "ReactJS1156", moment1, moment3));
        }
    };
}
