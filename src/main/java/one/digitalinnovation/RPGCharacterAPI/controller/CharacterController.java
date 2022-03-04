package one.digitalinnovation.RPGCharacterAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/character") // Uma API, versão 1, Classe que controla as demais: Character.
public class CharacterController {

    @GetMapping
    public String getBook(){
        return "API TEST!";
    }
}
