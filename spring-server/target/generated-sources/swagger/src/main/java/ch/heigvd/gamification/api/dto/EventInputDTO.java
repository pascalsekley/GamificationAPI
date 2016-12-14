package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * EventInputDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-14T14:38:31.463+01:00")

public class EventInputDTO   {
  private String name = null;

  private String description = null;

  private Long applicationId = null;

  private Long userAppId = null;

  public EventInputDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display name of the application.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Display name of the application.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EventInputDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the application.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of the application.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EventInputDTO applicationId(Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Id of the type of the application using the gamification platform
   * @return applicationId
  **/
  @ApiModelProperty(required = true, value = "Id of the type of the application using the gamification platform")
  public Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  public EventInputDTO userAppId(Long userAppId) {
    this.userAppId = userAppId;
    return this;
  }

   /**
   * Id of the user using the platform
   * @return userAppId
  **/
  @ApiModelProperty(required = true, value = "Id of the user using the platform")
  public Long getUserAppId() {
    return userAppId;
  }

  public void setUserAppId(Long userAppId) {
    this.userAppId = userAppId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventInputDTO eventInputDTO = (EventInputDTO) o;
    return Objects.equals(this.name, eventInputDTO.name) &&
        Objects.equals(this.description, eventInputDTO.description) &&
        Objects.equals(this.applicationId, eventInputDTO.applicationId) &&
        Objects.equals(this.userAppId, eventInputDTO.userAppId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, applicationId, userAppId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventInputDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    userAppId: ").append(toIndentedString(userAppId)).append("\n");
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

