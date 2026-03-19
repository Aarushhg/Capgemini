package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HelloController {
    @GetMapping("abc")
    public String sayHello() {
        return "Hello.html";
    }

//    @GetMapping("xyz")
//    public @ResponseBody String sayHello2() {
//        return "Hello xyz";
//    }
}
