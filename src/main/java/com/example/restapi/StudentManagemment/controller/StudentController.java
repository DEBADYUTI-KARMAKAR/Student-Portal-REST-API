package com.example.restapi.StudentManagemment.controller;


import com.example.restapi.StudentManagemment.model.Student;
import com.example.restapi.StudentManagemment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/students")
public class StudentController {

    @Qualifier("studentServiceImp")
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

    @DeleteMapping("/{id}")
    public String deleteStudentById(@PathVariable String id){
        return studentService.deleteStudentById(id);
    }


    @PutMapping("/{id}")
    public Student update(@RequestBody Student student, @PathVariable String id){
       return studentService.update(student,id);
    }

}
