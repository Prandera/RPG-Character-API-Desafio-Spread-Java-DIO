package one.digitalinnovation.RPGCharacterAPI.mapper;

import one.digitalinnovation.RPGCharacterAPI.dto.request.CharacterDTO;
import one.digitalinnovation.RPGCharacterAPI.entity.Character;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CharacterMapper {

    CharacterMapper INSTANCE = Mappers.getMapper(CharacterMapper.class);

    Character toModel(CharacterDTO characterDTO);

    CharacterDTO toDTO(Character character);
}
