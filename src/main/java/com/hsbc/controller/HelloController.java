package com.hsbc.controller;

import com.hsbc.entity.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/{x}/{y}")
    public String sayHelloName(@PathVariable("x") String name, @PathVariable("y") String tech){
        return "Hello " + name + " from "+tech;
    }

    @PostMapping("/student")
    public String saveStudent(@RequestBody Student student){
        System.out.println(student);
        return "Saved successfully";
    }

    @GetMapping("/student")
    public Student getStudent(){
        Student student = new Student(1,"Ajitheey","kadavulajith@gmail.com");
        return student;
    }





}
