package com.lydia.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//set up rest controller
@RestController
public class FunRestController {

    //expose "/" that return "Hello World"
    //handle HTTP GET request
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}
