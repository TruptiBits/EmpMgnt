package cds.gen.my.company;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.Function;
import javax.annotation.processing.Generated;

@CdsName("my.company.Salaries")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-06-19T05:05:51.074533172Z",
    comments = "com.sap.cds:cds-maven-plugin:2.10.0 / com.sap.cds:cds4j-api:2.10.0"
)
public interface Salaries_ extends StructuredType<Salaries_> {
  String CDS_NAME = "my.company.Salaries";

  ElementRef<Integer> salaryID();

  Employees_ employee();

  Employees_ employee(Function<Employees_, CqnPredicate> filter);

  ElementRef<Integer> employee_employeeID();

  ElementRef<BigDecimal> amount();

  ElementRef<String> currency();

  ElementRef<LocalDate> startDate();

  ElementRef<LocalDate> endDate();
}
