package castleSiege.effect.creator.api;

import interfaces.CommandAPI;
import valueObjects.EffectId;

public interface EffectCreatorCommandAPI extends CommandAPI {

    EffectId createEffect(CreateEffectEntry createEffectEntry);
}
