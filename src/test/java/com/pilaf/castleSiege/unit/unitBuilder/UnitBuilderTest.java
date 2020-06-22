package com.pilaf.castleSiege.unit.unitBuilder;

import com.pilaf.castleSiege.armor.Armor;
import com.pilaf.castleSiege.armor.ArmorStore;
import com.pilaf.castleSiege.recruit.Recruit;
import com.pilaf.castleSiege.recruit.RecruitStore;
import com.pilaf.castleSiege.unit.Unit;
import com.pilaf.castleSiege.unit.UnitBuilder;
import com.pilaf.castleSiege.weapon.Weapon;
import com.pilaf.castleSiege.weapon.WeaponStore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@ExtendWith(MockitoExtension.class)
public class UnitBuilderTest {


    @InjectMocks
    UnitBuilder unitBuilder;

    @Test
    void calculateCost1Test(){
        Weapon shortSword = WeaponStore.shortSword();
        Recruit recruit = RecruitStore.FolanPeasant();
        Armor armor = ArmorStore.lightLeatherArmor();
        Unit result = unitBuilder.buildUnit("aaa", recruit, shortSword, WeaponStore.none(), armor);
        assertThat(result.getCost()).isEqualTo(9);
    }

    @Test
    void calculateCost2Test(){
        Weapon shortSword = WeaponStore.shortSword();
        Recruit recruit = RecruitStore.FolanMilitia();
        Armor armor = ArmorStore.fullPlateArmor();
        Unit result = unitBuilder.buildUnit("aaa", recruit, shortSword, shortSword, armor);
        assertThat(result.getCost()).isEqualTo(29);
    }

    @Test
    void calculateTimeToRecruit1Test(){
        Weapon shortSword = WeaponStore.shortSword();
        Recruit recruit = RecruitStore.FolanPeasant();
        Armor armor = ArmorStore.lightLeatherArmor();
        Unit result = unitBuilder.buildUnit("aaa", recruit, shortSword, WeaponStore.none(), armor);
        assertThat(result.getTimeToBuild()).isEqualTo(9);
    }

    @Test
    void calculateTimeToRecruit2Test(){
        Weapon shortSword = WeaponStore.shortSword();
        Recruit recruit = RecruitStore.FolanMilitia();
        Armor armor = ArmorStore.fullPlateArmor();
        Unit result = unitBuilder.buildUnit("aaa", recruit, shortSword, shortSword, armor);
        assertThat(result.getCost()).isEqualTo(29);
    }
}
