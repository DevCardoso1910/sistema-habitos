package com.seuhabito.sistema_habitos;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/teste")
    public String olamundo(){
        return "API FUNCIONADO IGUAL FOGUETE ======<3";
    }


}
