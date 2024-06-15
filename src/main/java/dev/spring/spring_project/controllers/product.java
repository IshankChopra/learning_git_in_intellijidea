package dev.spring.spring_project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class product {
    @GetMapping("get/hello")
    public String hello(){
        return "hello ishank chopra";
    }

//    @GetMapping("/get/hello/2")
//    public String hello2(){
//        return "hello ishank 2";
//    }
}

