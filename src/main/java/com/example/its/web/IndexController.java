package com.example.its.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

     // GET /
    @GetMapping("/")
//    @ResponseBody
    public String index() {
//        return "<h1>Hello, World!</h1>";
        return "index";
    }
}
