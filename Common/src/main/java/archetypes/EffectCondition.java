package archetypes;

@FunctionalInterface
public interface EffectCondition {
    boolean effectCondition(CardTarget cardTarget);
}
