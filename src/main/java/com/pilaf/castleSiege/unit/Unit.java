package com.pilaf.castleSiege.unit;

import com.pilaf.castleSiege.armor.Armor;
import com.pilaf.castleSiege.recruit.Recruit;
import com.pilaf.castleSiege.weapon.Weapon;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Unit {
    String name;
    int cost;
    int timeToBuild;
    Recruit recruit;
    Weapon weapon;
    Armor armor;
    Weapon offHand;

    int hitPoints;
    BigDecimal speed;
    BigDecimal attackSpeed;
    int minDmg;
    int maxDmg;
    int staticDmg;
    BigDecimal armorPenetration;
    int physicalReduction;
    int magicalReduction;
    int attackRolls;
    int rangeRolls;
    int defenceRolls;




}
