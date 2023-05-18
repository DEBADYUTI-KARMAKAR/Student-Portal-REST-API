package com.example.restapi.StudentManagemment.service;

import com.example.restapi.StudentManagemment.entity.StudentEntity;
import com.example.restapi.StudentManagemment.model.Student;
import com.example.restapi.StudentManagemment.repository.StudentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


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
        List<StudentEntity> studentEntityList = studentRepository.findAll();

        List<Student> students = studentEntityList
                .stream()
                .map(studentEntity -> {
                    Student student = new Student();
                    BeanUtils.copyProperties(studentEntity,student);
                    return student;
                })
                .collect(Collectors.toList());
        return students;
    }

    @Override
    public Student getStudentById(String id) {

        StudentEntity studentEntity = studentRepository.findById(id).get();
        Student student =new Student();
        BeanUtils.copyProperties(studentEntity,student);
        return student;
    }

    @Override
    public String deleteStudentById(String id) {
        
        studentRepository.deleteById(id);
        
        return "Student deleted id is:"+id;
    }

    @Override
    public Student update(Student student, String id) {
        StudentEntity entity = new StudentEntity();
        BeanUtils.copyProperties(student,entity);
        studentRepository.saveAndFlush(entity);
        return student;
    }
}
