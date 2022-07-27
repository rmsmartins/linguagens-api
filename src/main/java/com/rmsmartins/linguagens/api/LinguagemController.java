package com.rmsmartins.linguagens.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LinguagemController {
    
    private List<Linguagem> linguagens = 
        List.of(
            new Linguagem("Java", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png", 1),
            new Linguagem("PHP", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png", 2),
            new Linguagem("Javascript", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/javascript/javascript_256x256.png", 3),
            new Linguagem("Python", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/python/python_256x256.png", 4)
        );


    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens() {     
        return linguagens;   
    }
    
}
