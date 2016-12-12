package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * LocationPointScale
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-11T14:36:18.324+01:00")

public class LocationPointScale   {
  private String locationPointScale = null;

  public LocationPointScale locationPointScale(String locationPointScale) {
    this.locationPointScale = locationPointScale;
    return this;
  }

   /**
   * Unique URL to access the new object created.
   * @return locationPointScale
  **/
  @ApiModelProperty(required = true, value = "Unique URL to access the new object created.")
  public String getLocationPointScale() {
    return locationPointScale;
  }

  public void setLocationPointScale(String locationPointScale) {
    this.locationPointScale = locationPointScale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationPointScale locationPointScale = (LocationPointScale) o;
    return Objects.equals(this.locationPointScale, locationPointScale.locationPointScale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationPointScale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationPointScale {\n");
    
    sb.append("    locationPointScale: ").append(toIndentedString(locationPointScale)).append("\n");
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

