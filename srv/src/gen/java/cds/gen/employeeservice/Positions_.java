package cds.gen.employeeservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;

@CdsName("EmployeeService.Positions")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-06-19T05:05:51.074533172Z",
    comments = "com.sap.cds:cds-maven-plugin:2.10.0 / com.sap.cds:cds4j-api:2.10.0"
)
public interface Positions_ extends StructuredType<Positions_> {
  String CDS_NAME = "EmployeeService.Positions";

  ElementRef<Integer> positionID();

  ElementRef<String> title();

  ElementRef<String> description();
}
