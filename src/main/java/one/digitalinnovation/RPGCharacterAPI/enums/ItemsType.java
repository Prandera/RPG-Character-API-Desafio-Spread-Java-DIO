package one.digitalinnovation.RPGCharacterAPI.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ItemsType {

    ARMOUR("Armour"),
    WEAPON("Weapon"),
    CONSUMABLE("Consumable"),
    GEAR("Adventuring Gear"),
    TOOLS("Tools"),
    TRADE_GOODS("Trade Goods");

    private final String description;
}
