package com.example.restapi.StudentManagemment.controller;


import com.example.restapi.StudentManagemment.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Welcome to home page!";
    }

    @RequestMapping(value="/students",method = RequestMethod.GET)
    @GetMapping("/students")
    public Student student(){
        Student student = new Student();
        student.setId("1");
        student.setName("Saheb");
        student.setEmailId("demo.gmail.com");

        return student;
    }

    @GetMapping("/{id}")
    public String pathVariable(@PathVariable String id){

        return "Your id is :"+id;
    }
}
