package cds.gen.my.company;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("my.company.Departments")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-06-19T05:05:51.074533172Z",
    comments = "com.sap.cds:cds-maven-plugin:2.10.0 / com.sap.cds:cds4j-api:2.10.0"
)
public interface Departments extends CdsData {
  String DEPARTMENT_ID = "departmentID";

  String NAME = "name";

  String DESCRIPTION = "description";

  Integer getDepartmentID();

  void setDepartmentID(Integer departmentID);

  String getName();

  void setName(String name);

  String getDescription();

  void setDescription(String description);

  Departments_ ref();

  static Departments create() {
    return Struct.create(Departments.class);
  }

  static Departments create(Integer departmentID) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(DEPARTMENT_ID, departmentID);
    return Struct.access(keys).as(Departments.class);
  }
}
