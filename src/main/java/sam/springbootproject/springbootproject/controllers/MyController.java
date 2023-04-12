package sam.springbootproject.springbootproject.controllers;

import org.springframework.stereotype.Controller;
import sam.springbootproject.springbootproject.services.GreetingService;
import sam.springbootproject.springbootproject.services.GreetingServiceImpl;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm in the controller");

        return greetingService.sayGreeting();
    }
}
