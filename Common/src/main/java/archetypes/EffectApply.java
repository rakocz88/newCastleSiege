package archetypes;

import java.util.List;

@FunctionalInterface
public interface EffectApply {
    List<EffectApplyResult> apply(CardTarget cardTarget);
}
