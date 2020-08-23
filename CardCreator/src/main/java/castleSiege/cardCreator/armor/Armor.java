package castleSiege.cardCreator.armor;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

@Value
@Builder
public class Armor {
    String name;
    int cost;
    int timeToBuild;
    int physicalResistance;
    int magicalResistance;
    BigDecimal speedPenalty;
    BigDecimal defencePenalty;
    BigDecimal weaponSpeedPenalty;
    BigDecimal attackPenalty;
    BigDecimal rangeAttackPenalty;
}
