package sam.springbootproject.springbootproject.services.faux;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sam.springbootproject.springbootproject.services.DatasourceService;

@Profile("QA")
@Service("fauxDataSourceService")
public class FauxServiceQa implements DatasourceService {
    @Override
    public String getDataSource() {
        return "QA";
    }
}
