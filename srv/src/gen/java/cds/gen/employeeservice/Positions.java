package cds.gen.employeeservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("EmployeeService.Positions")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-06-19T05:05:51.074533172Z",
    comments = "com.sap.cds:cds-maven-plugin:2.10.0 / com.sap.cds:cds4j-api:2.10.0"
)
public interface Positions extends CdsData {
  String POSITION_ID = "positionID";

  String TITLE = "title";

  String DESCRIPTION = "description";

  Integer getPositionID();

  void setPositionID(Integer positionID);

  String getTitle();

  void setTitle(String title);

  String getDescription();

  void setDescription(String description);

  Positions_ ref();

  static Positions create() {
    return Struct.create(Positions.class);
  }

  static Positions create(Integer positionID) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(POSITION_ID, positionID);
    return Struct.access(keys).as(Positions.class);
  }
}
