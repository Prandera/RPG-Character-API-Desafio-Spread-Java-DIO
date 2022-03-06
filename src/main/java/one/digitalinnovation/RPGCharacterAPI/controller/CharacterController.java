package one.digitalinnovation.RPGCharacterAPI.controller;

import one.digitalinnovation.RPGCharacterAPI.dto.request.CharacterDTO;
import one.digitalinnovation.RPGCharacterAPI.dto.response.MessageResponseDTO;
import one.digitalinnovation.RPGCharacterAPI.exception.CharacterNotFoundException;
import one.digitalinnovation.RPGCharacterAPI.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
    public MessageResponseDTO createCharacter(@RequestBody @Valid CharacterDTO characterDTO) {
        return characterService.createCharacter(characterDTO);
    }

    @GetMapping
    public List<CharacterDTO> listAll(){
        return characterService.listAll();
    }

    @GetMapping("/{id}")
    public CharacterDTO findById(@PathVariable Long id) throws CharacterNotFoundException {
        return characterService.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws CharacterNotFoundException {
        characterService.delete(id);
    }
}
