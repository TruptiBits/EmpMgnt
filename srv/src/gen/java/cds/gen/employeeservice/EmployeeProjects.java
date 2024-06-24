package cds.gen.employeeservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("EmployeeService.EmployeeProjects")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-06-19T05:05:51.074533172Z",
    comments = "com.sap.cds:cds-maven-plugin:2.10.0 / com.sap.cds:cds4j-api:2.10.0"
)
public interface EmployeeProjects extends CdsData {
  String EMPLOYEE_PROJECT_ID = "employeeProjectID";

  String EMPLOYEE = "employee";

  String EMPLOYEE_EMPLOYEE_ID = "employee_employeeID";

  String PROJECT = "project";

  String PROJECT_PROJECT_ID = "project_projectID";

  String START_DATE = "startDate";

  String END_DATE = "endDate";

  Integer getEmployeeProjectID();

  void setEmployeeProjectID(Integer employeeProjectID);

  Employees getEmployee();

  void setEmployee(Map<String, ?> employee);

  @CdsName(EMPLOYEE_EMPLOYEE_ID)
  Integer getEmployeeEmployeeID();

  @CdsName(EMPLOYEE_EMPLOYEE_ID)
  void setEmployeeEmployeeID(Integer employeeEmployeeID);

  Projects getProject();

  void setProject(Map<String, ?> project);

  @CdsName(PROJECT_PROJECT_ID)
  Integer getProjectProjectID();

  @CdsName(PROJECT_PROJECT_ID)
  void setProjectProjectID(Integer projectProjectID);

  LocalDate getStartDate();

  void setStartDate(LocalDate startDate);

  LocalDate getEndDate();

  void setEndDate(LocalDate endDate);

  EmployeeProjects_ ref();

  static EmployeeProjects create() {
    return Struct.create(EmployeeProjects.class);
  }

  static EmployeeProjects create(Integer employeeProjectID) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(EMPLOYEE_PROJECT_ID, employeeProjectID);
    return Struct.access(keys).as(EmployeeProjects.class);
  }
}
