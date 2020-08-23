package castleSiege.effect.creator;

import castleSiege.effect.creator.api.CreateEffectEntry;
import castleSiege.effect.creator.api.EffectCreatorCommandAPI;
import castleSiege.effect.creator.api.EffectCreatorQueryAPI;
import valueObjects.EffectId;

import java.util.UUID;

public class EffectCreatorService implements EffectCreatorQueryAPI, EffectCreatorCommandAPI {

    @Override
    public EffectId createEffect(CreateEffectEntry createEffectEntry) {
        return new EffectId(UUID.randomUUID());
    }
}
