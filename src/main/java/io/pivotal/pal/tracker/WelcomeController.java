package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class WelcomeController {

    public String welcomemessage;

    public WelcomeController( @Value("${welcome.message}") final String welcomemessage) {
        this.welcomemessage=welcomemessage;
    }

    @GetMapping("/")
    public String sayHello() {
        return welcomemessage;
    }
}