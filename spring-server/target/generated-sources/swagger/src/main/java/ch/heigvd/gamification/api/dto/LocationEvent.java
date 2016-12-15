package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * LocationEvent
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-15T18:02:48.510+01:00")

public class LocationEvent   {
  private String locationEvent = null;

  public LocationEvent locationEvent(String locationEvent) {
    this.locationEvent = locationEvent;
    return this;
  }

   /**
   * Unique URL to access the new object created.
   * @return locationEvent
  **/
  @ApiModelProperty(required = true, value = "Unique URL to access the new object created.")
  public String getLocationEvent() {
    return locationEvent;
  }

  public void setLocationEvent(String locationEvent) {
    this.locationEvent = locationEvent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationEvent locationEvent = (LocationEvent) o;
    return Objects.equals(this.locationEvent, locationEvent.locationEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationEvent {\n");
    
    sb.append("    locationEvent: ").append(toIndentedString(locationEvent)).append("\n");
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

