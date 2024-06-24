package cds.gen.my.company;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("my.company.Salaries")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-06-19T05:05:51.074533172Z",
    comments = "com.sap.cds:cds-maven-plugin:2.10.0 / com.sap.cds:cds4j-api:2.10.0"
)
public interface Salaries extends CdsData {
  String SALARY_ID = "salaryID";

  String EMPLOYEE = "employee";

  String EMPLOYEE_EMPLOYEE_ID = "employee_employeeID";

  String AMOUNT = "amount";

  String CURRENCY = "currency";

  String START_DATE = "startDate";

  String END_DATE = "endDate";

  Integer getSalaryID();

  void setSalaryID(Integer salaryID);

  Employees getEmployee();

  void setEmployee(Map<String, ?> employee);

  @CdsName(EMPLOYEE_EMPLOYEE_ID)
  Integer getEmployeeEmployeeID();

  @CdsName(EMPLOYEE_EMPLOYEE_ID)
  void setEmployeeEmployeeID(Integer employeeEmployeeID);

  BigDecimal getAmount();

  void setAmount(BigDecimal amount);

  String getCurrency();

  void setCurrency(String currency);

  LocalDate getStartDate();

  void setStartDate(LocalDate startDate);

  LocalDate getEndDate();

  void setEndDate(LocalDate endDate);

  Salaries_ ref();

  static Salaries create() {
    return Struct.create(Salaries.class);
  }

  static Salaries create(Integer salaryID) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(SALARY_ID, salaryID);
    return Struct.access(keys).as(Salaries.class);
  }
}
