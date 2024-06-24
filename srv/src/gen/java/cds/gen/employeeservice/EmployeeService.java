package cds.gen.employeeservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.services.cds.ApplicationService;
import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.cds.RemoteService;
import javax.annotation.processing.Generated;

@Generated(
    value = "cds-maven-plugin",
    date = "2024-06-19T05:05:51.074533172Z",
    comments = "com.sap.cds:cds-maven-plugin:2.10.0 / com.sap.cds:cds4j-api:2.10.0"
)
@CdsName(EmployeeService_.CDS_NAME)
public interface EmployeeService extends CqnService {
  interface Application extends ApplicationService, EmployeeService {
  }

  interface Remote extends RemoteService, EmployeeService {
  }
}
