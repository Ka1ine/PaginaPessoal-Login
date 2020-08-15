package com.programem.login;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
    @GetMapping("/Index")
    public String index(){
        return "index";
        
    }
}