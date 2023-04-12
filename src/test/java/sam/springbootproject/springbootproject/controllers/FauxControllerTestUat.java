package sam.springbootproject.springbootproject.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@ActiveProfiles({"UAT", "EN"})
@SpringBootTest
class FauxControllerTestUat {
    @Autowired
    FauxController fauxController;

    @Test
    void getDataSource() {
        System.out.println(fauxController.getDataSource());
    }
}