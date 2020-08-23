package castleSiege.card.creator.api;

import castleSiege.card.creator.api.model.CreateCard;
import interfaces.CommandAPI;

import java.util.UUID;

public interface CardCreatorCommandAPI extends CommandAPI {

    public UUID createCard(CreateCard createCard);
}
