package sam.springbootproject.springbootproject.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sam.springbootproject.springbootproject.services.DatasourceService;

@Profile({"DEV","default"})
@Service("fauxDataSourceService")
public class FauxServiceDev implements DatasourceService {
    @Override
    public String getDataSource() {
        return "Dev";
    }
}
