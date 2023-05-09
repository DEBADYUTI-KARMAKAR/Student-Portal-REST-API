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

    // when data is mendetory then we can use Path variable

    @GetMapping("/students/{id}/{crs}")
    public String pathVariable(@PathVariable String id,@PathVariable("crs") String course){

        return "Your id is :"+id+"Course"+course;
    }


    // when daTA IS NOT MANDETORY THEN WE CAN USE RequestParam
    @GetMapping("/requestparam")
    public String requestParam(@RequestParam String name,@RequestParam(name = "course",required = false,defaultValue="") String course){
        return "Name is"+name+"Course is :"+course;
    }
}
