package com.example.studentcurd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")

public class StudentController {
    @GetMapping("/list")
    public String list(){
        return "student/index";

    }
    @GetMapping("/think")
    public String think(){
        return "student/insert";
    }

    

    
}
