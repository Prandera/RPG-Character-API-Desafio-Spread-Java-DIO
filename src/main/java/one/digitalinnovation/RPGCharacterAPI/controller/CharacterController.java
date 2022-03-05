package one.digitalinnovation.RPGCharacterAPI.controller;

import one.digitalinnovation.RPGCharacterAPI.dto.response.MessageResponseDTO;
import one.digitalinnovation.RPGCharacterAPI.entity.Character;
import one.digitalinnovation.RPGCharacterAPI.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/character") // Uma API, versão 1, Classe que controla as demais: Character.
public class CharacterController {

    private CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createCharacter(@RequestBody Character character) {
        return characterService.createCharacter(character);
    }
}
