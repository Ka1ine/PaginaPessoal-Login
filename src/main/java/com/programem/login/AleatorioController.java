package com.programem.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AleatorioController {
    @GetMapping("/Aleatorio")
    public String Aleatorio(){
        return "Aleatorio";
    }
    
}