package com.example.restapi.StudentManagemment.service;

import com.example.restapi.StudentManagemment.model.Student;

import java.util.List;

public interface StudentService {

    Student save(Student student);

    List<Student> getAllStudents();


    Student getStudentById(String id);

    String deleteStudentById(String id);
}
