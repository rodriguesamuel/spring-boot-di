package sam.springbootproject.springbootproject.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sam.springbootproject.springbootproject.services.DatasourceService;

@Profile("PROD")
@Service("fauxDataSourceService")
public class FauxServiceProd implements DatasourceService {
    @Override
    public String getDataSource() {
        return "Prod";
    }
}
