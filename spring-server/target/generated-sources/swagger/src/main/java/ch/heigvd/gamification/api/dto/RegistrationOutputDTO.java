package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * RegistrationOutputDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-19T20:02:53.332+01:00")

public class RegistrationOutputDTO   {
  private Long registrationId = null;

  private String name = null;

  private String description = null;

  public RegistrationOutputDTO registrationId(Long registrationId) {
    this.registrationId = registrationId;
    return this;
  }

   /**
   * Unique identifier representing a specific registration.
   * @return registrationId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier representing a specific registration.")
  public Long getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(Long registrationId) {
    this.registrationId = registrationId;
  }

  public RegistrationOutputDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Display name of application.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Display name of application.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RegistrationOutputDTO description(String description) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationOutputDTO registrationOutputDTO = (RegistrationOutputDTO) o;
    return Objects.equals(this.registrationId, registrationOutputDTO.registrationId) &&
        Objects.equals(this.name, registrationOutputDTO.name) &&
        Objects.equals(this.description, registrationOutputDTO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationId, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationOutputDTO {\n");
    
    sb.append("    registrationId: ").append(toIndentedString(registrationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

