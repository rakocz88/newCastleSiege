package com.pilaf.castleSiege.armor;

import java.math.BigDecimal;

public class ArmorStore {

    public static Armor none(){
        return Armor.builder().name("none")
                .cost(0)
                .timeToBuild(0)
                .physicalResistance(0)
                .magicalResistance(0)
                .speedPenalty(BigDecimal.ZERO)
                .weaponSpeedPenalty(BigDecimal.ZERO)
                .rangeAttackPenalty(BigDecimal.ZERO)
                .defencePenalty(BigDecimal.ZERO)
                .build();
    }

    public static Armor lightLeatherArmor(){
        return Armor.builder().name("Light leather armor")
                .cost(2)
                .timeToBuild(1)
                .physicalResistance(3)
                .magicalResistance(2)
                .speedPenalty(BigDecimal.ZERO)
                .weaponSpeedPenalty(BigDecimal.ZERO)
                .rangeAttackPenalty(BigDecimal.ZERO)
                .defencePenalty(BigDecimal.ZERO)
                .build();
    }

    public static Armor heavyLeatherArmor(){
        return Armor.builder().name("Heavy leather armor")
                .cost(4)
                .timeToBuild(2)
                .physicalResistance(5)
                .magicalResistance(3)
                .speedPenalty(new BigDecimal(0.9))
                .weaponSpeedPenalty(BigDecimal.ZERO)
                .rangeAttackPenalty(BigDecimal.ZERO)
                .defencePenalty(BigDecimal.ZERO)
                .build();
    }

    public static Armor fullPlateArmor(){
        return Armor.builder().name("Full Plate Armor")
                .cost(15)
                .timeToBuild(5)
                .physicalResistance(12)
                .magicalResistance(4)
                .speedPenalty(new BigDecimal(0.6))
                .weaponSpeedPenalty(new BigDecimal(0.5))
                .rangeAttackPenalty(new BigDecimal(0.5))
                .defencePenalty(new BigDecimal(0.7))
                .build();
    }
}
