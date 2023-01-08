package com.university.studentmanagementsystem.service;

import com.university.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student updateStudent(Student student, Long id);

    void deleteStudent(Long id);
}
