package com.example.restapi.StudentManagemment.service;

import com.example.restapi.StudentManagemment.entity.StudentEntity;
import com.example.restapi.StudentManagemment.model.Student;
import com.example.restapi.StudentManagemment.repository.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class StudentV2ServiceImp implements  StudentService {




    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student save(Student student) {

        if(student.getStudentId() == null ||
                student.getEmailId().isEmpty()) {
            student.setStudentId(UUID.randomUUID().toString());
        }

        StudentEntity entity = new StudentEntity();
        BeanUtils.copyProperties(student,entity);

        studentRepository.save(entity);


        return student;
    }


    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student getStudentById(String id) {
        return null;
    }

    @Override
    public String deleteStudentById(String id) {
        return null;
    }

    @Override
    public Student update(Student student, String id) {
        return null;
    }
}
