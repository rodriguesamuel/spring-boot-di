package sam.springbootproject.springbootproject.controllers;

import sam.springbootproject.springbootproject.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
