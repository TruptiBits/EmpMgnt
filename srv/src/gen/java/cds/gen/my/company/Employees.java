package cds.gen.my.company;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("my.company.Employees")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-06-19T05:05:51.074533172Z",
    comments = "com.sap.cds:cds-maven-plugin:2.10.0 / com.sap.cds:cds4j-api:2.10.0"
)
public interface Employees extends CdsData {
  String EMPLOYEE_ID = "employeeID";

  String FIRST_NAME = "firstName";

  String LAST_NAME = "lastName";

  String DATE_OF_BIRTH = "dateOfBirth";

  String DEPARTMENT = "department";

  String DEPARTMENT_DEPARTMENT_ID = "department_departmentID";

  String POSITION = "position";

  String POSITION_POSITION_ID = "position_positionID";

  String ADDRESS = "address";

  String ADDRESS_ADDRESS_ID = "address_addressID";

  String SALARY = "salary";

  String SALARY_SALARY_ID = "salary_salaryID";

  String CONTACT_DETAILS = "contactDetails";

  String CONTACT_DETAILS_CONTACT_ID = "contactDetails_contactID";

  String PROJECTS = "projects";

  String PROJECTS_EMPLOYEE_PROJECT_ID = "projects_employeeProjectID";

  Integer getEmployeeID();

  void setEmployeeID(Integer employeeID);

  String getFirstName();

  void setFirstName(String firstName);

  String getLastName();

  void setLastName(String lastName);

  LocalDate getDateOfBirth();

  void setDateOfBirth(LocalDate dateOfBirth);

  Departments getDepartment();

  void setDepartment(Map<String, ?> department);

  @CdsName(DEPARTMENT_DEPARTMENT_ID)
  Integer getDepartmentDepartmentID();

  @CdsName(DEPARTMENT_DEPARTMENT_ID)
  void setDepartmentDepartmentID(Integer departmentDepartmentID);

  Positions getPosition();

  void setPosition(Map<String, ?> position);

  @CdsName(POSITION_POSITION_ID)
  Integer getPositionPositionID();

  @CdsName(POSITION_POSITION_ID)
  void setPositionPositionID(Integer positionPositionID);

  Addresses getAddress();

  void setAddress(Map<String, ?> address);

  @CdsName(ADDRESS_ADDRESS_ID)
  Integer getAddressAddressID();

  @CdsName(ADDRESS_ADDRESS_ID)
  void setAddressAddressID(Integer addressAddressID);

  Salaries getSalary();

  void setSalary(Map<String, ?> salary);

  @CdsName(SALARY_SALARY_ID)
  Integer getSalarySalaryID();

  @CdsName(SALARY_SALARY_ID)
  void setSalarySalaryID(Integer salarySalaryID);

  ContactDetails getContactDetails();

  void setContactDetails(Map<String, ?> contactDetails);

  @CdsName(CONTACT_DETAILS_CONTACT_ID)
  Integer getContactDetailsContactID();

  @CdsName(CONTACT_DETAILS_CONTACT_ID)
  void setContactDetailsContactID(Integer contactDetailsContactID);

  EmployeeProjects getProjects();

  void setProjects(Map<String, ?> projects);

  @CdsName(PROJECTS_EMPLOYEE_PROJECT_ID)
  Integer getProjectsEmployeeProjectID();

  @CdsName(PROJECTS_EMPLOYEE_PROJECT_ID)
  void setProjectsEmployeeProjectID(Integer projectsEmployeeProjectID);

  Employees_ ref();

  static Employees create() {
    return Struct.create(Employees.class);
  }

  static Employees create(Integer employeeID) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(EMPLOYEE_ID, employeeID);
    return Struct.access(keys).as(Employees.class);
  }
}
