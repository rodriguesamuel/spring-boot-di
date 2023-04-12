package sam.springbootproject.springbootproject.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sam.springbootproject.springbootproject.services.DatasourceService;

@Controller
public class FauxController {
    private final DatasourceService datasourceService;

    public FauxController(@Qualifier("fauxDataSourceService") DatasourceService datasourceService) {
        this.datasourceService = datasourceService;
    }

    public String getDataSource(){
        return "You are in " + datasourceService.getDataSource() + " Environment";
    }
}
