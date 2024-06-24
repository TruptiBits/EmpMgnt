package cds.gen.my.company;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.processing.Generated;

@CdsName("my.company.Projects")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-06-19T05:05:51.074533172Z",
    comments = "com.sap.cds:cds-maven-plugin:2.10.0 / com.sap.cds:cds4j-api:2.10.0"
)
public interface Projects_ extends StructuredType<Projects_> {
  String CDS_NAME = "my.company.Projects";

  ElementRef<Integer> projectID();

  ElementRef<String> name();

  ElementRef<String> description();

  EmployeeProjects_ employees();

  EmployeeProjects_ employees(Function<EmployeeProjects_, CqnPredicate> filter);

  ElementRef<Integer> employees_employeeProjectID();
}
