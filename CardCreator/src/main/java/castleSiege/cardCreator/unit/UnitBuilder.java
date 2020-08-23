package castleSiege.cardCreator.unit;

import castleSiege.cardCreator.armor.Armor;
import castleSiege.cardCreator.recruit.Recruit;
import castleSiege.cardCreator.weapon.DmgModifier;
import castleSiege.cardCreator.weapon.Weapon;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class UnitBuilder {

    private static final BigDecimal AP_PER_STRENGTH = new BigDecimal(0.03);
    private static final BigDecimal DEX_WEAPON_SPEED_BONUS = new BigDecimal(0.10);
    private static final BigDecimal STANDARD_SPEED = BigDecimal.TEN;

    public Unit buildUnit(String unitName, Recruit recruit, Weapon weapon, Weapon offWeapon, Armor armor){
        return Unit.builder().name(unitName)
                .cost(calculateCost(recruit.getCost(), weapon.getCost(), offWeapon.getCost(), armor.getCost()))
                .timeToBuild(calculateRecruitmentTime(recruit.getTimeToRecruit(), weapon.getTimeToRecruit(), offWeapon.getTimeToRecruit(), armor.getTimeToBuild()))
                .recruit(recruit)
                .weapon(weapon)
                .offHand(offWeapon)
                .armor(armor)
                .hitPoints(calculateHitPoints(recruit))
                .speed(calculateSpeed(recruit, armor))
                .attackSpeed(calculateAttackSpeed(recruit, weapon, offWeapon, armor))
                .minDmg(calculateMinDmg(weapon, offWeapon))
                .maxDmg(calculateMaxDmg(weapon, offWeapon))
                .staticDmg(calculateStaticDmg(recruit, weapon, offWeapon))
                .armorPenetration(calculateArmorPenetration(recruit, weapon, offWeapon))
                .physicalReduction(calculatePhysicalReduction(recruit, armor))
                .magicalReduction(calculateMagicalReduction(recruit, armor))
                .attackRolls(calculateAttackRoles(recruit, weapon, offWeapon))
                .rangeRolls(calculateRangeAttackRoles(recruit, weapon, offWeapon, armor))
                .defenceRolls(calculateDefenceRoles(recruit, armor))
                .build();
    }

    private int calculateDefenceRoles(Recruit recruit, Armor armor) {
        return new BigDecimal(recruit.getDefenceSkills()).multiply(armor.getDefencePenalty()).intValue();
    }


    private int calculateRangeAttackRoles(Recruit recruit, Weapon weapon, Weapon offWeapon, Armor armor) {
        return new BigDecimal(recruit.getRangeCombatSkills()).multiply(armor.getRangeAttackPenalty()).intValue();
    }


    private int calculateAttackRoles(Recruit recruit, Weapon weapon, Weapon offWeapon) {
        return new BigDecimal(recruit.getCloseCombatSkills()).intValue();
    }


    private int calculateMagicalReduction(Recruit recruit, Armor armor) {
        return new BigDecimal(armor.getMagicalResistance()).intValue();
    }

    private int calculatePhysicalReduction(Recruit recruit, Armor armor) {
        return new BigDecimal(armor.getPhysicalResistance()).intValue();
    }

    private BigDecimal calculateArmorPenetration(Recruit recruit, Weapon weapon, Weapon offWeapon) {
        BigDecimal apValue =  weapon.getArmorPenetration().add(new BigDecimal(recruit.getStrength()).multiply(AP_PER_STRENGTH));
        if (apValue.compareTo(BigDecimal.ONE)>=1){
            return BigDecimal.ONE;
        } else {
            return apValue;
        }
    }

    private int calculateStaticDmg(Recruit recruit, Weapon weapon, Weapon offWeapon) {
       if (weapon.getDmgModifier() == DmgModifier.DEXTERITY){
           return new BigDecimal(weapon.getDmgModifierValue()).multiply(new BigDecimal(recruit.getDexterity())).intValue();
       } else if (weapon.getDmgModifier() == DmgModifier.STRENGTH){
           return new BigDecimal(weapon.getDmgModifierValue()).multiply(new BigDecimal(recruit.getStrength())).intValue();
       }  else if (weapon.getDmgModifier() == DmgModifier.WISDOM) {
           return new BigDecimal(weapon.getDmgModifierValue()).multiply(new BigDecimal(recruit.getWisdom())).intValue();
       } else {
           return 0;
       }
    }

    private int calculateMaxDmg(Weapon weapon, Weapon offWeapon) {
        return weapon.getMaxDmg();
    }

    private int calculateMinDmg(Weapon weapon, Weapon offWeapon) {
        return weapon.getMinDmg();
    }

    private BigDecimal calculateAttackSpeed(Recruit recruit, Weapon weapon, Weapon offWeapon, Armor armor) {
        BigDecimal weaponSpeed = weapon.getSpeed().subtract(new BigDecimal(recruit.getDexterity()).multiply(DEX_WEAPON_SPEED_BONUS)).add(armor.getWeaponSpeedPenalty());
        if (weaponSpeed.compareTo(new BigDecimal(0.5)) <1){
            return new BigDecimal(0.5);
        } else {
            return weaponSpeed;
        }
    }

    private BigDecimal calculateSpeed(Recruit recruit, Armor armor) {
        return STANDARD_SPEED.multiply(armor.getSpeedPenalty());
    }

    private int calculateHitPoints(Recruit recruit) {
        return recruit.getVitality() * 10;
    }

    private int calculateRecruitmentTime(int recruitTime, int weaponBuildTime, int offHandBuildTime, int armorBuildTime) {
        return recruitTime + weaponBuildTime + offHandBuildTime + armorBuildTime;
    }

    private int calculateCost(int cost, int cost1, int cost2, int cost3) {
        return cost + cost1 + cost2 + cost3;
    }
}
