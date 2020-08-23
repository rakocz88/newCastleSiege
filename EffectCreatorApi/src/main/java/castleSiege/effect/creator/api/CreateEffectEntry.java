package castleSiege.effect.creator.api;

import archetypes.EffectArchetype;
import lombok.Value;

@Value
public class CreateEffectEntry {
    String name;
    EffectArchetype effectArchetype;
}
