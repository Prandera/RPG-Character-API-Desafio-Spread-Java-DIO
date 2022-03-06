package one.digitalinnovation.RPGCharacterAPI.service;

import one.digitalinnovation.RPGCharacterAPI.dto.request.CharacterDTO;
import one.digitalinnovation.RPGCharacterAPI.dto.response.MessageResponseDTO;
import one.digitalinnovation.RPGCharacterAPI.entity.Character;
import one.digitalinnovation.RPGCharacterAPI.exception.CharacterNotFoundException;
import one.digitalinnovation.RPGCharacterAPI.mapper.CharacterMapper;
import one.digitalinnovation.RPGCharacterAPI.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CharacterService {

    private CharacterRepository characterRepository;

    private final CharacterMapper characterMapper = CharacterMapper.INSTANCE;

    @Autowired
    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public MessageResponseDTO createCharacter(CharacterDTO characterDTO) {
        Character characterToSave = characterMapper.toModel(characterDTO);

        Character savedCharacter = characterRepository.save(characterToSave);
        return createMessageResponse(savedCharacter.getId(), "Created character with ID ");
    }

    public List<CharacterDTO> listAll() {
        List<Character> allCharacter = characterRepository.findAll();
        return allCharacter.stream()
                .map(characterMapper::toDTO)
                .collect(Collectors.toList());
    }

    public CharacterDTO findById(Long id) throws CharacterNotFoundException {
        Character character = verifyIfExists(id);
        return characterMapper.toDTO(character);
    }

    public void delete(Long id) throws CharacterNotFoundException {
        verifyIfExists(id);
        characterRepository.deleteById(id);
    }


    public MessageResponseDTO updateById(Long id, CharacterDTO characterDTO) throws CharacterNotFoundException {
        verifyIfExists(id);

        Character characterToUpdate = characterMapper.toModel(characterDTO);

        Character updatedCharacter = characterRepository.save(characterToUpdate);
        return createMessageResponse(updatedCharacter.getId(), "Updated character with ID ");
    }

    private Character verifyIfExists(Long id) throws CharacterNotFoundException {
        return characterRepository
                .findById(id)
                .orElseThrow(() -> new CharacterNotFoundException(id));
    }

    private MessageResponseDTO createMessageResponse(Long id, String message) {
        return MessageResponseDTO
                .builder()
                .message(message + id)
                .build();
    }
}
