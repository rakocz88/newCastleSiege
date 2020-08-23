package castleSiege.rest.cardCreator;

import castleSiege.card.creator.api.model.CreateCard;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController()
@RequestMapping("card-creator")
@RequiredArgsConstructor
public class CardCreatorController {

    private final CardCreatorService cardCreatorService;

    @PostMapping("create")
    public UUID createCard(CreateCard cardEntry){
       return cardCreatorService.createCard(cardEntry);
    }
}
