package castleSiege.rest;

import castleSiege.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/test")
    public String test(@RequestParam(value = "name", defaultValue = "test") String name) {
        return testService.test(name);
    }

//    @PostMapping("create")
//    public UUID createCard(CreateCard cardEntry){
//        return UUID.randomUUID();
//    }

}
