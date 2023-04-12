package sam.springbootproject.springbootproject.controllers;

import org.springframework.stereotype.Controller;
import sam.springbootproject.springbootproject.services.GreetingService;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public  String sayHello(){
        return greetingService.sayGreeting();
    }
}
