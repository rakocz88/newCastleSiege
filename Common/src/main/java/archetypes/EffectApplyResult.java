package archetypes;

import enums.EffectApplyResultType;
import lombok.Value;

@Value
public class EffectApplyResult {
    String parameter;
    EffectApplyResultType effectApplyResultType;
    int value;
}
