//package castleSiege.cardCreator.unit.unitBuilder;
//
//import castleSiege.cardCreator.armor.Armor;
//import castleSiege.cardCreator.armor.ArmorStore;
//import castleSiege.cardCreator.recruit.Recruit;
//import castleSiege.cardCreator.recruit.RecruitStore;
//import castleSiege.cardCreator.unit.Unit;
//import castleSiege.cardCreator.unit.UnitBuilder;
//import castleSiege.cardCreator.weapon.Weapon;
//import castleSiege.cardCreator.weapon.WeaponStore;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.junit.jupiter.MockitoExtension;
//import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
//
//@ExtendWith(MockitoExtension.class)
//public class UnitBuilderTest {
//
//
//    @InjectMocks
//    UnitBuilder unitBuilder;
//
//    @Test
//    void calculateCost1Test(){
//        Weapon shortSword = WeaponStore.shortSword();
//        Recruit recruit = RecruitStore.FolanPeasant();
//        Armor armor = ArmorStore.lightLeatherArmor();
//        Unit result = unitBuilder.buildUnit("aaa", recruit, shortSword, WeaponStore.none(), armor);
//        assertThat(result.getCost()).isEqualTo(9);
//    }
//
//    @Test
//    void calculateCost2Test(){
//        Weapon shortSword = WeaponStore.shortSword();
//        Recruit recruit = RecruitStore.FolanMilitia();
//        Armor armor = ArmorStore.fullPlateArmor();
//        Unit result = unitBuilder.buildUnit("aaa", recruit, shortSword, shortSword, armor);
//        assertThat(result.getCost()).isEqualTo(29);
//    }
//
//    @Test
//    void calculateTimeToRecruit1Test(){
//        Weapon weapon = WeaponStore.TwoHandedAxe();
//        Recruit recruit = RecruitStore.FolanPeasant();
//        Armor armor = ArmorStore.lightLeatherArmor();
//        Unit result = unitBuilder.buildUnit("aaa", recruit, weapon, WeaponStore.none(), armor);
//        assertThat(result.getTimeToBuild()).isEqualTo(9);
//    }
//
//    @Test
//    void calculateTimeToRecruit2Test(){
//        Weapon shortSword = WeaponStore.shortSword();
//        Recruit recruit = RecruitStore.FolanMilitia();
//        Armor armor = ArmorStore.fullPlateArmor();
//        Unit result = unitBuilder.buildUnit("aaa", recruit, shortSword, shortSword, armor);
//        assertThat(result.getTimeToBuild()).isEqualTo(15);
//    }
//
//    @Test
//    void calculateMinDmg(){
//        Weapon shortSword = WeaponStore.shortSword();
//        Recruit recruit = RecruitStore.FolanMilitia();
//        Armor armor = ArmorStore.fullPlateArmor();
//        Unit result = unitBuilder.buildUnit("aaa", recruit, shortSword, shortSword, armor);
//        assertThat(result.getMinDmg()).isEqualTo(4);
//    }
//
//    @Test
//    void calculateMaxDmg(){
//        Weapon shortSword = WeaponStore.shortSword();
//        Recruit recruit = RecruitStore.FolanMilitia();
//        Armor armor = ArmorStore.fullPlateArmor();
//        Unit result = unitBuilder.buildUnit("aaa", recruit, shortSword, shortSword, armor);
//        assertThat(result.getMaxDmg()).isEqualTo(6);
//    }
//
//    @Test
//    void calculateStaticDmg(){
//        Weapon shortSword = WeaponStore.shortSword();
//        Recruit recruit = RecruitStore.FolanMilitia();
//        Armor armor = ArmorStore.fullPlateArmor();
//        Unit result = unitBuilder.buildUnit("aaa", recruit, shortSword, shortSword, armor);
//        assertThat(result.getStaticDmg()).isEqualTo(8);
//    }
//}
