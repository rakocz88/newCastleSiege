package valueObjects;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.util.UUID;

@Value
public class CardId implements DomainId {
    UUID id;
}
