package cds.gen.my.company;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.processing.Generated;

@CdsName("my.company.ContactDetails")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-06-19T05:05:51.074533172Z",
    comments = "com.sap.cds:cds-maven-plugin:2.10.0 / com.sap.cds:cds4j-api:2.10.0"
)
public interface ContactDetails_ extends StructuredType<ContactDetails_> {
  String CDS_NAME = "my.company.ContactDetails";

  ElementRef<Integer> contactID();

  Employees_ employee();

  Employees_ employee(Function<Employees_, CqnPredicate> filter);

  ElementRef<Integer> employee_employeeID();

  ElementRef<String> email();

  ElementRef<String> phone();
}
