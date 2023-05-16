package com.example.restapi.StudentManagemment.controller;


import com.example.restapi.StudentManagemment.model.Student;
import com.example.restapi.StudentManagemment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v2/students")
public class StudentV2Controller {


    @Qualifier("studentV2ServiceImp")
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student save(@RequestBody Student student){

        return studentService.save(student);
    }


}
