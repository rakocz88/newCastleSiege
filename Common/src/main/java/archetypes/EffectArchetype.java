package archetypes;

import lombok.Value;

import java.util.List;


@Value
public class EffectArchetype {
    List<Class<? extends CardArchetype>> supports;
    EffectTargetArchetype effectTarget;
    EffectConditionArchetype effectConditionArchetype;
    EffectApplyArchetype effectApplyArchetype;
}
