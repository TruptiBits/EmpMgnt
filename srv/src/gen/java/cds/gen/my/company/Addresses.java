package cds.gen.my.company;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("my.company.Addresses")
@Generated(
    value = "cds-maven-plugin",
    date = "2024-06-19T05:05:51.074533172Z",
    comments = "com.sap.cds:cds-maven-plugin:2.10.0 / com.sap.cds:cds4j-api:2.10.0"
)
public interface Addresses extends CdsData {
  String ADDRESS_ID = "addressID";

  String STREET = "street";

  String CITY = "city";

  String STATE = "state";

  String POSTAL_CODE = "postalCode";

  String COUNTRY = "country";

  Integer getAddressID();

  void setAddressID(Integer addressID);

  String getStreet();

  void setStreet(String street);

  String getCity();

  void setCity(String city);

  String getState();

  void setState(String state);

  String getPostalCode();

  void setPostalCode(String postalCode);

  String getCountry();

  void setCountry(String country);

  Addresses_ ref();

  static Addresses create() {
    return Struct.create(Addresses.class);
  }

  static Addresses create(Integer addressID) {
    Map<String, Object> keys = new HashMap<>();
    keys.put(ADDRESS_ID, addressID);
    return Struct.access(keys).as(Addresses.class);
  }
}
