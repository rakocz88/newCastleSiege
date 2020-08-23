package castleSiege.cardCreator.recruit;

import lombok.Builder;
import lombok.Value;

@Value(staticConstructor = "of")
@Builder
public class Recruit {
    String name;
    int cost;
    int timeToRecruit;
    Race race;
    RecruitSize size;
    int closeCombatSkills;
    int rangeCombatSkills;
    int defenceSkills;
    int strength;
    int dexterity;
    int wisdom;
    int vitality;
}
