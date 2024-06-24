package cds.gen.my.company;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("my.company.ContactDetails")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-06-19T05:05:51.074533172Z",
    comments = "com.sap.cds:cds-maven-plugin:2.10.0 / com.sap.cds:cds4j-api:2.10.0"
)
public interface ContactDetails extends CdsData {
  String CONTACT_ID = "contactID";

  String EMPLOYEE = "employee";

  String EMPLOYEE_EMPLOYEE_ID = "employee_employeeID";

  String EMAIL = "email";

  String PHONE = "phone";

  Integer getContactID();

  void setContactID(Integer contactID);

  Employees getEmployee();

  void setEmployee(Map<String, ?> employee);

  @CdsName(EMPLOYEE_EMPLOYEE_ID)
  Integer getEmployeeEmployeeID();

  @CdsName(EMPLOYEE_EMPLOYEE_ID)
  void setEmployeeEmployeeID(Integer employeeEmployeeID);

  String getEmail();

  void setEmail(String email);

  String getPhone();

  void setPhone(String phone);

  ContactDetails_ ref();

  static ContactDetails create() {
    return Struct.create(ContactDetails.class);
  }

  static ContactDetails create(Integer contactID) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(CONTACT_ID, contactID);
    return Struct.access(keys).as(ContactDetails.class);
  }
}
