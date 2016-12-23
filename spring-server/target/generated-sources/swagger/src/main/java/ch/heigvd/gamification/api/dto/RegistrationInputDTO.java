package ch.heigvd.gamification.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * RegistrationInputDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-12-19T20:02:53.332+01:00")

public class RegistrationInputDTO   {
  private String name = null;

  private String description = null;

  private String password = null;

  public RegistrationInputDTO name(String name) {
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

  public RegistrationInputDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of application.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of application.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RegistrationInputDTO password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password of the application.
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Password of the application.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationInputDTO registrationInputDTO = (RegistrationInputDTO) o;
    return Objects.equals(this.name, registrationInputDTO.name) &&
        Objects.equals(this.description, registrationInputDTO.description) &&
        Objects.equals(this.password, registrationInputDTO.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationInputDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

