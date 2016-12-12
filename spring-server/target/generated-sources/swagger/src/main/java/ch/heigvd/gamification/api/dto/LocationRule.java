package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * LocationRule
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-12T23:59:39.533+01:00")

public class LocationRule   {
  private String locationRule = null;

  public LocationRule locationRule(String locationRule) {
    this.locationRule = locationRule;
    return this;
  }

   /**
   * Unique URL to access the new object created.
   * @return locationRule
  **/
  @ApiModelProperty(required = true, value = "Unique URL to access the new object created.")
  public String getLocationRule() {
    return locationRule;
  }

  public void setLocationRule(String locationRule) {
    this.locationRule = locationRule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationRule locationRule = (LocationRule) o;
    return Objects.equals(this.locationRule, locationRule.locationRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationRule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationRule {\n");
    
    sb.append("    locationRule: ").append(toIndentedString(locationRule)).append("\n");
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

