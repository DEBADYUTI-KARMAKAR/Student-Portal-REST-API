package com.example.restapi.StudentManagemment.controller;


import com.example.restapi.StudentManagemment.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Welcome to home page!";
    }

    @RequestMapping(value="/user",method = RequestMethod.GET)
    @GetMapping("/user")
    public User student(){
        User user = new User();
        user.setId("1");
        user.setName("Saheb");
        user.setEmailId("demo.gmail.com");

        return user;
    }

    // when data is mendetory then we can use Path variable

    @GetMapping("/user/{id}/{crs}")
    public String pathVariable(@PathVariable String id,@PathVariable("crs") String course){

        return "Your id is :"+id+"Course"+course;
    }


    // when daTA IS NOT MANDETORY THEN WE CAN USE RequestParam
    @GetMapping("/requestparam")
    public String requestParam(@RequestParam String name,@RequestParam(name = "course",required = false,defaultValue="") String course){
        return "Name is"+name+"Course is :"+course;
    }
}
