package castleSiege.rest.cardCreator;

import castleSiege.card.creator.api.CardCreatorCommandAPI;
import castleSiege.card.creator.api.model.CreateCard;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardCreatorService {

    private final CardCreatorCommandAPI cardCreatorCommandAPI;

    public UUID createCard(CreateCard createCard){
        return cardCreatorCommandAPI.createCard(createCard);
    }
}
