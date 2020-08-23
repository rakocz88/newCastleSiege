package valueObjects;

import lombok.Value;

import java.util.UUID;

@Value
public class EffectId implements DomainId {
    UUID id;

}
