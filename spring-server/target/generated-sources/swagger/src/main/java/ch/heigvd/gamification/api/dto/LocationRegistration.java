package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * LocationRegistration
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-19T20:02:53.332+01:00")

public class LocationRegistration   {
  private String locationRegistration = null;

  public LocationRegistration locationRegistration(String locationRegistration) {
    this.locationRegistration = locationRegistration;
    return this;
  }

   /**
   * Unique URL to access the new object created.
   * @return locationRegistration
  **/
  @ApiModelProperty(required = true, value = "Unique URL to access the new object created.")
  public String getLocationRegistration() {
    return locationRegistration;
  }

  public void setLocationRegistration(String locationRegistration) {
    this.locationRegistration = locationRegistration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationRegistration locationRegistration = (LocationRegistration) o;
    return Objects.equals(this.locationRegistration, locationRegistration.locationRegistration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationRegistration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationRegistration {\n");
    
    sb.append("    locationRegistration: ").append(toIndentedString(locationRegistration)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

