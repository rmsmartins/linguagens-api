package com.rmsmartins.linguagens.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LinguagemController {
    
  
 


    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens() {     
        return linguagens;   
    }
    
}
