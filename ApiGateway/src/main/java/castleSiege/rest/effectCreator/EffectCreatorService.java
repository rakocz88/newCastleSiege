package castleSiege.rest.effectCreator;

import archetypes.*;
import castleSiege.effect.creator.api.CreateEffectEntry;
import castleSiege.effect.creator.api.EffectCreatorCommandAPI;
import enums.EffectApplyResultType;
import enums.EffectTarget;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
@RequiredArgsConstructor
public class EffectCreatorService {
    private final EffectCreatorCommandAPI effectCreatorCommandAPI;

    public void createEffect() {
        EffectApplyArchetype effectApplyArchetype = new EffectApplyArchetype(cardTarget -> {
            if (cardTarget instanceof HeroArchetype) {
                HeroArchetype hero = (HeroArchetype) cardTarget;
                return Arrays.asList(new EffectApplyResult(
                        "Strength",
                        EffectApplyResultType.DECREASE,
                        2));
            } else {
                return Arrays.asList(new EffectApplyResult(
                        "Strength",
                        EffectApplyResultType.DECREASE,
                        2));
            }
        }
        );

        EffectArchetype effectArchetype = new EffectArchetype(
                Arrays.asList(HeroArchetype.class, SoldierArchetype.class),
                new EffectTargetArchetype(EffectTarget.ANY_ONE),
                new EffectConditionArchetype(cardTarget -> true),
                effectApplyArchetype);
        effectCreatorCommandAPI.createEffect(new CreateEffectEntry("effect1", effectArchetype));
    }

}
