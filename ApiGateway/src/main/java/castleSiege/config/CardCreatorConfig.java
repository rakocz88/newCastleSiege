package castleSiege.config;

import castleSiege.card.creator.api.CardCreatorCommandAPI;
import castleSiege.cardCreator.service.CardCreatorCommandService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CardCreatorConfig {

    @Bean
    public CardCreatorCommandAPI cardCreatorCommandAPI(){
        return new CardCreatorCommandService();
    }
}
