package com.anupreeet.employeemanagementspringbootrestfulapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller
@RestController
public class HelloWorldController {

    @GetMapping("/hello-spring")
    public static String myWorld(){
        return "Hello Spring boot!";
    }
}
