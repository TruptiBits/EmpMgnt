package cds.gen.my.company;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;
import java.util.function.Function;
import javax.annotation.processing.Generated;

@CdsName("my.company.Employees")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-06-19T05:05:51.074533172Z",
    comments = "com.sap.cds:cds-maven-plugin:2.10.0 / com.sap.cds:cds4j-api:2.10.0"
)
public interface Employees_ extends StructuredType<Employees_> {
  String CDS_NAME = "my.company.Employees";

  ElementRef<Integer> employeeID();

  ElementRef<String> firstName();

  ElementRef<String> lastName();

  ElementRef<LocalDate> dateOfBirth();

  Departments_ department();

  Departments_ department(Function<Departments_, CqnPredicate> filter);

  ElementRef<Integer> department_departmentID();

  Positions_ position();

  Positions_ position(Function<Positions_, CqnPredicate> filter);

  ElementRef<Integer> position_positionID();

  Addresses_ address();

  Addresses_ address(Function<Addresses_, CqnPredicate> filter);

  ElementRef<Integer> address_addressID();

  Salaries_ salary();

  Salaries_ salary(Function<Salaries_, CqnPredicate> filter);

  ElementRef<Integer> salary_salaryID();

  ContactDetails_ contactDetails();

  ContactDetails_ contactDetails(Function<ContactDetails_, CqnPredicate> filter);

  ElementRef<Integer> contactDetails_contactID();

  EmployeeProjects_ projects();

  EmployeeProjects_ projects(Function<EmployeeProjects_, CqnPredicate> filter);

  ElementRef<Integer> projects_employeeProjectID();
}
