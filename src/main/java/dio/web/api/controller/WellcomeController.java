package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellcomeController {
    @GetMapping
    public String welcome(){

        return "WELCOME TO MY SRPING BOOT WEB API";
    }
}
