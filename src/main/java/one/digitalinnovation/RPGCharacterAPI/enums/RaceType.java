package one.digitalinnovation.RPGCharacterAPI.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RaceType {

    DRAGONBORN("Dragonborn"),
    DWARF("Dwarf"),
    ELF("Elf"),
    GNOME("Gnome"),
    HALF_ELF("Half-Elf"),
    HALFLING("Hafling"),
    HALF_ORC("Half-Orc"),
    HUMAN("Human"),
    TIEFLING("Tiefling"),
    GENASI("Genasi"),
    GOLIATH("Goliath"),
    GOBLIN("Goblin"),
    ORC("Orc"),
    MINOTAUR("Minotaur");


    private final String description;

}
