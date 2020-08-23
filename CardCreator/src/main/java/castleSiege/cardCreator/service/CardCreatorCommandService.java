package castleSiege.cardCreator.service;

import castleSiege.card.creator.api.CardCreatorCommandAPI;
import castleSiege.card.creator.api.model.CreateCard;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class CardCreatorCommandService implements CardCreatorCommandAPI {

    @Override
    public UUID createCard(CreateCard createCard) {
        // some card generation
        log.info(createCard.toString());
        return UUID.randomUUID();
    }
}
