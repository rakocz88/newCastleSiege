package castleSiege.config;

import castleSiege.effect.creator.EffectCreatorService;
import castleSiege.effect.creator.api.EffectCreatorCommandAPI;
import castleSiege.effect.creator.api.EffectCreatorQueryAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EffectCreatorConfig {

    @Bean
    public EffectCreatorQueryAPI effectCreatorQueryAPI(){
        return new EffectCreatorService();
    }

    @Bean
    public EffectCreatorCommandAPI effectCreatorCommandAPI(){
        return new EffectCreatorService();
    }
}
