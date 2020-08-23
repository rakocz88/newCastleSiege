package castleSiege.cardCreator.unit;

import castleSiege.cardCreator.armor.Armor;
import castleSiege.cardCreator.recruit.Recruit;
import castleSiege.cardCreator.weapon.Weapon;
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
