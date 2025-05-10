package com.firstspringboot.FirstSpringBoot.controller;

import org.springframework.web.bind.annotation.*;
// entry point for all request from the client and  it will return response
@RestController
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/get")
    public String getMyName(){
        return "Vinay";
    }
    @PostMapping("/post")
        public String postMyName(){
            return "Vinay";
    }

    @DeleteMapping("/delete")
    public String deleteMyName(){
        return "Vinay";
    }
}
