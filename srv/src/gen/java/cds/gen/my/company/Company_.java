package cds.gen.my.company;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;
import javax.annotation.processing.Generated;

@Generated(
    value = "cds-maven-plugin",
    date = "2024-06-19T05:05:51.074533172Z",
    comments = "com.sap.cds:cds-maven-plugin:2.10.0 / com.sap.cds:cds4j-api:2.10.0"
)
@CdsName("my.company")
public interface Company_ {
  String CDS_NAME = "my.company";

  Class<EmployeeProjects_> EMPLOYEE_PROJECTS = EmployeeProjects_.class;

  Class<Salaries_> SALARIES = Salaries_.class;

  Class<Departments_> DEPARTMENTS = Departments_.class;

  Class<Addresses_> ADDRESSES = Addresses_.class;

  Class<Employees_> EMPLOYEES = Employees_.class;

  Class<Projects_> PROJECTS = Projects_.class;

  Class<Positions_> POSITIONS = Positions_.class;

  Class<ContactDetails_> CONTACT_DETAILS = ContactDetails_.class;
}
