package com.tobil.helloworld.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloBuddy(){
        return "Hei buddy";
    }

    @GetMapping("/hello-world")
    public String helloWolrd(){
        return "hello world from path hello-world";
    }

}
