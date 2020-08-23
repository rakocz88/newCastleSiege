package castleSiege.card.creator.api.model;


import enums.CardType;
import lombok.Value;

@Value
public class CreateCard {
    String name;
    CardType cardType;
}
