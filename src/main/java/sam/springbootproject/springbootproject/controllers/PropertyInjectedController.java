package sam.springbootproject.springbootproject.controllers;

import sam.springbootproject.springbootproject.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
