package one.digitalinnovation.RPGCharacterAPI.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CharacterNotFoundException extends Exception {
    public CharacterNotFoundException(Long id) {
        super("Character with ID " + id + " not found.");
    }
}
