package one.digitalinnovation.RPGCharacterAPI.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.RPGCharacterAPI.entity.CharClass;
import one.digitalinnovation.RPGCharacterAPI.entity.Items;
import one.digitalinnovation.RPGCharacterAPI.entity.Race;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CharacterDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String nome;

    private Float gold;

    @NotEmpty
    @Size(min = 1, max = 25)
    private int level;

    @NotEmpty
    private Race race;

    @NotEmpty
    private CharClass charClass;

    @Valid
    @NotEmpty
    private List<Items> items;
}


