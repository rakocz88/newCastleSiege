package castleSiege.rest.effectCreator;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("effect-creator")
@RequiredArgsConstructor
public class EffectCreatorController {
    private final EffectCreatorService effectCreatorService;
}
