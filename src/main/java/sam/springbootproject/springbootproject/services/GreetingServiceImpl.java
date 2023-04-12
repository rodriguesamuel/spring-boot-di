package sam.springbootproject.springbootproject.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello everyone from base service";
    }
}
