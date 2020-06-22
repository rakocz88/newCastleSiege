package com.pilaf.castleSiege.recruit;

public class RecruitStore {

    public static Recruit FolanPeasant(){
        return Recruit.builder()
                .name("Folan Peasant")
                .cost(5)
                .timeToRecruit(4)
                .size(RecruitSize.NORMAL)
                .race(Race.HUMAN)
                .closeCombatSkills(1)
                .rangeCombatSkills(1)
                .defenceSkills(1)
                .wisdom(1)
                .dexterity(2)
                .strength(4)
                .vitality(3)
                .build();
    }

    public static Recruit FolanMilitia(){
        return Recruit.builder()
                .name("Folan Militia")
                .cost(10)
                .timeToRecruit(6)
                .size(RecruitSize.NORMAL)
                .race(Race.HUMAN)
                .closeCombatSkills(4)
                .rangeCombatSkills(3)
                .defenceSkills(3)
                .wisdom(2)
                .dexterity(2)
                .strength(4)
                .vitality(3)
                .build();
    }
}
