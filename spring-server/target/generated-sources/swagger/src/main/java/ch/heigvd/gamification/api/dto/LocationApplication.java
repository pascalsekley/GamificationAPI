package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * LocationApplication
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-15T18:02:48.510+01:00")

public class LocationApplication   {
  private String locationApplication = null;

  public LocationApplication locationApplication(String locationApplication) {
    this.locationApplication = locationApplication;
    return this;
  }

   /**
   * Unique URL to access the new object created.
   * @return locationApplication
  **/
  @ApiModelProperty(required = true, value = "Unique URL to access the new object created.")
  public String getLocationApplication() {
    return locationApplication;
  }

  public void setLocationApplication(String locationApplication) {
    this.locationApplication = locationApplication;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationApplication locationApplication = (LocationApplication) o;
    return Objects.equals(this.locationApplication, locationApplication.locationApplication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationApplication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationApplication {\n");
    
    sb.append("    locationApplication: ").append(toIndentedString(locationApplication)).append("\n");
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

