package sam.springbootproject.springbootproject.controllers.faux;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import sam.springbootproject.springbootproject.controllers.FauxController;

@ActiveProfiles({"QA", "EN"})
@SpringBootTest
class FauxControllerTestQa {
    @Autowired
    FauxController fauxController;

    @Test
    void getDataSource() {
        System.out.println(fauxController.getDataSource());
    }
}