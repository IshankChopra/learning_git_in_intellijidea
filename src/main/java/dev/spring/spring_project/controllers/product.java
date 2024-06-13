package dev.spring.spring_project.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class product {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }



}
