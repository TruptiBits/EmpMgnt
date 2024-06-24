package cds.gen.employeeservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;
import java.util.function.Function;
import javax.annotation.processing.Generated;

@CdsName("EmployeeService.EmployeeProjects")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-06-19T05:05:51.074533172Z",
    comments = "com.sap.cds:cds-maven-plugin:2.10.0 / com.sap.cds:cds4j-api:2.10.0"
)
public interface EmployeeProjects_ extends StructuredType<EmployeeProjects_> {
  String CDS_NAME = "EmployeeService.EmployeeProjects";

  ElementRef<Integer> employeeProjectID();

  Employees_ employee();

  Employees_ employee(Function<Employees_, CqnPredicate> filter);

  ElementRef<Integer> employee_employeeID();

  Projects_ project();

  Projects_ project(Function<Projects_, CqnPredicate> filter);

  ElementRef<Integer> project_projectID();

  ElementRef<LocalDate> startDate();

  ElementRef<LocalDate> endDate();
}
