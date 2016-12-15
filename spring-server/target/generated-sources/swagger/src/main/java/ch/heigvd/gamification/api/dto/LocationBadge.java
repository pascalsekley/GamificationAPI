package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * LocationBadge
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-15T18:02:48.510+01:00")

public class LocationBadge   {
  private String locationBadge = null;

  public LocationBadge locationBadge(String locationBadge) {
    this.locationBadge = locationBadge;
    return this;
  }

   /**
   * Unique URL to access the new object created.
   * @return locationBadge
  **/
  @ApiModelProperty(required = true, value = "Unique URL to access the new object created.")
  public String getLocationBadge() {
    return locationBadge;
  }

  public void setLocationBadge(String locationBadge) {
    this.locationBadge = locationBadge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationBadge locationBadge = (LocationBadge) o;
    return Objects.equals(this.locationBadge, locationBadge.locationBadge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationBadge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationBadge {\n");
    
    sb.append("    locationBadge: ").append(toIndentedString(locationBadge)).append("\n");
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

