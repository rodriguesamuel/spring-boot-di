package sam.springbootproject.springbootproject.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sam.springbootproject.springbootproject.services.GreetingService;

@Profile({"EN","default"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world - EN";
    }
}
