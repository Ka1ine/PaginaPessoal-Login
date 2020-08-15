package com.programem.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SobreMimController {
    @GetMapping("/SobreMim")
    public String SobreMim(){
        return "SobreMim";
    }
    
}