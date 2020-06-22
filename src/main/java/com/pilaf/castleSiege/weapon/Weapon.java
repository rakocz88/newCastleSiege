package com.pilaf.castleSiege.weapon;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

@Value(staticConstructor = "of")
@Builder
public class Weapon {
    String name;
    int cost;
    int timeToRecruit;
    int range;
    BigDecimal speed;
    int minDmg;
    int maxDmg;
    DmgModifier dmgModifier;
    BigDecimal armorPenetration;
    int dmgModifierValue;
}
