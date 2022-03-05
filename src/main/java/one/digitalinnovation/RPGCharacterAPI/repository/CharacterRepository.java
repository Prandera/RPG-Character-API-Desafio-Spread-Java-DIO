package one.digitalinnovation.RPGCharacterAPI.repository;

import one.digitalinnovation.RPGCharacterAPI.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {

//    Character save(Character character); Testing without the implementation of this method.
}
