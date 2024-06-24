package cds.gen.employeeservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("EmployeeService.Projects")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-06-19T05:05:51.074533172Z",
    comments = "com.sap.cds:cds-maven-plugin:2.10.0 / com.sap.cds:cds4j-api:2.10.0"
)
public interface Projects extends CdsData {
  String PROJECT_ID = "projectID";

  String NAME = "name";

  String DESCRIPTION = "description";

  String EMPLOYEES = "employees";

  String EMPLOYEES_EMPLOYEE_PROJECT_ID = "employees_employeeProjectID";

  Integer getProjectID();

  void setProjectID(Integer projectID);

  String getName();

  void setName(String name);

  String getDescription();

  void setDescription(String description);

  EmployeeProjects getEmployees();

  void setEmployees(Map<String, ?> employees);

  @CdsName(EMPLOYEES_EMPLOYEE_PROJECT_ID)
  Integer getEmployeesEmployeeProjectID();

  @CdsName(EMPLOYEES_EMPLOYEE_PROJECT_ID)
  void setEmployeesEmployeeProjectID(Integer employeesEmployeeProjectID);

  Projects_ ref();

  static Projects create() {
    return Struct.create(Projects.class);
  }

  static Projects create(Integer projectID) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(PROJECT_ID, projectID);
    return Struct.access(keys).as(Projects.class);
  }
}
