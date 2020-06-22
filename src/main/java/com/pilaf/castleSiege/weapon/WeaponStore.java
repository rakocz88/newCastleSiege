package com.pilaf.castleSiege.weapon;

import java.math.BigDecimal;

public class WeaponStore {

    public static Weapon none(){
        return Weapon.builder()
                .name("none")
                .cost(0)
                .timeToRecruit(0)
                .minDmg(0)
                .maxDmg(0)
                .dmgModifier(DmgModifier.NONE)
                .dmgModifierValue(0)
                .speed(null)
                .range(0)
                .armorPenetration(BigDecimal.ZERO)
                .build();
    }

    public static Weapon shortSword(){
        return Weapon.builder()
                .name("Short Sword")
                .cost(2)
                .timeToRecruit(2)
                .minDmg(4)
                .maxDmg(6)
                .dmgModifier(DmgModifier.STRENGTH)
                .dmgModifierValue(2)
                .speed(new BigDecimal(1.5))
                .range(0)
                .armorPenetration(new BigDecimal(0.15))
                .build();
    }

    public static Weapon TwoHandedAxe(){
        return Weapon.builder()
                .name("Two Handed Axe")
                .cost(4)
                .timeToRecruit(4)
                .minDmg(1)
                .maxDmg(12)
                .dmgModifier(DmgModifier.STRENGTH)
                .dmgModifierValue(4)
                .speed(new BigDecimal(3))
                .range(0)
                .armorPenetration(new BigDecimal(0.35))
                .build();
    }
}
