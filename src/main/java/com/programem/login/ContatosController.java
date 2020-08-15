package com.programem.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContatosController {
    @GetMapping("/Contatos")
    public String Contatos(){
        return "Contatos";
    }
    
}
