package com.example.restapi.StudentManagemment.service;


import com.example.restapi.StudentManagemment.exception.StudentNotFoundException;
import com.example.restapi.StudentManagemment.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceImp implements StudentService {

    List<Student> students = new ArrayList<>();
    @Override
    public Student save(Student student) {
        if(student.getStudentId()== null || student.getEmailId().isEmpty()){
            student.setStudentId(UUID.randomUUID().toString());
        }
        students.add(student);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudentById(String id) {
        return students
                .stream().
                filter(student -> student.getStudentId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new StudentNotFoundException((""+"Student not found with Id"+ id)))

                ;
    }


}
