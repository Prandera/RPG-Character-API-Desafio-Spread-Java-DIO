package one.digitalinnovation.RPGCharacterAPI.service;

import one.digitalinnovation.RPGCharacterAPI.dto.response.MessageResponseDTO;
import one.digitalinnovation.RPGCharacterAPI.entity.Character;
import one.digitalinnovation.RPGCharacterAPI.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {

    private CharacterRepository characterRepository;

    @Autowired
    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public MessageResponseDTO createCharacter(Character character) {
        Character savedCharacter = characterRepository.save(character);
        return MessageResponseDTO
                .builder()
                .message("Created character with ID " + savedCharacter.getId())
                .build();
    }
}
