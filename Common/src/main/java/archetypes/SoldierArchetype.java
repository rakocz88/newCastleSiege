package archetypes;

import lombok.Value;

import java.util.List;

@Value
public class SoldierArchetype implements CardArchetype {
    UnitArchetype unitArchetype;
    WeaponArchetype weaponArchetype;
    OffHandArchetype offHandArchetype;
    ArmorArchetype armorArchetype;
    List<UnitSkillArchetype> unitSkillArchetypeList;
}
