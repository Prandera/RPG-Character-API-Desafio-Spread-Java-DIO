package one.digitalinnovation.RPGCharacterAPI.controller;

import one.digitalinnovation.RPGCharacterAPI.dto.response.MessageResponseDTO;
import one.digitalinnovation.RPGCharacterAPI.entity.Character;
import one.digitalinnovation.RPGCharacterAPI.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/character") // Uma API, versão 1, Classe que controla as demais: Character.
public class CharacterController {

    private CharacterRepository characterRepository;

    @Autowired
    public CharacterController(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @PostMapping
    public MessageResponseDTO createCharacter(@RequestBody Character character) {
        Character savedCharacter = characterRepository.save(character);
        return MessageResponseDTO
                .builder()
                .message("Created character with ID " + savedCharacter.getId())
                .build();
    }
}
