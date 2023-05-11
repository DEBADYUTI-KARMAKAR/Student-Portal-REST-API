package com.example.restapi.StudentManagemment.controller;


import com.example.restapi.StudentManagemment.model.Student;
import com.example.restapi.StudentManagemment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @GetMapping
    public List<Student> getAllStudents(){

        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id){
        return studentService.getStudentById(id);
    }

}
