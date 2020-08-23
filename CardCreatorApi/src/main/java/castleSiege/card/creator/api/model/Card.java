package castleSiege.card.creator.api.model;

import archetypes.CardArchetype;
import enums.CardType;
import lombok.Value;
import valueObjects.CardId;

@Value
public class Card {
    CardId cardId;
    String name;
    CardType cardType;
    CardArchetype cardArchetype;
}
