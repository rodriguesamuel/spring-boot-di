package sam.springbootproject.springbootproject.controllers.faux;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import sam.springbootproject.springbootproject.controllers.FauxController;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles({"DEV", "EN"})
@SpringBootTest
class FauxControllerTestDev {

    @Autowired
    FauxController fauxController;

    @Test
    void getDataSource() {
        System.out.println(fauxController.getDataSource());
    }
}