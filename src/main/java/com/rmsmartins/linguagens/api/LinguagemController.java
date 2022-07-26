package com.rmsmartins.linguagens.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LinguagemController {
    
    @GetMapping(value = "/linguagem-preferida")
    public String processaLinguagemPreferidaString(){
        return "Oi, Java!";
    }
    
}
